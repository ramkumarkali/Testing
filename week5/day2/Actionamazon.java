package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class Actionamazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("(//span[@class = 'a-price-whole'])[1]"));
		System.out.println("Price of the product : "+price.getText());
		
		Actions act = new Actions(driver);
		
		WebElement ratings = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
//		System.out.println("Ratings the text : "+ratings.getText());
		act.moveToElement(ratings).click().perform();
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'ratings')]")).getText());
		
		
		WebElement first = driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-line-clamp-2 s-line-clamp-3')])[1]"));
		act.moveToElement(first).click().perform();
		
		for(String index:driver.getWindowHandles()) {
			driver.switchTo().window(index);
		}
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("product_screenshot.png"));
		System.out.println("Screenshot saved successfully.");
		
		
		WebElement addcart = driver.findElement(By.xpath("(//input[@id = 'add-to-cart-button'])[2]"));
		act.moveToElement(addcart).click().perform();
		
		WebElement checkoutptice = driver.findElement(By.xpath("//div[@id ='sw-subtotal']//span[@class ='a-price-whole']"));
		System.out.println(checkoutptice.getText());
		
		if(checkoutptice.equals(price)) {
			System.out.println("product price : "+price);
		}
		
		driver.quit();
	}

}
