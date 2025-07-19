package week4.day1.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListAjio {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		final int wait = 3000;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		
//		WebElement radio = driverWait.until((By.xpath("//label[contains(., 'Men')]/input[@type='radio']")).click();
		Thread.sleep(3000);
		
		 WebElement radioBtnMen = driverWait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//label[@class='common-customRadio gender-label' and normalize-space()='Men']")));
	        radioBtnMen.click();
		
		WebElement checkboxHandbag = driverWait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='categories-list']//label[text()='Handbags']")));
		checkboxHandbag.click();	
		Thread.sleep(wait);
		String bagcount  = driver.findElement(By.xpath("//span[@class ='title-count']")).getText();
		
		List<WebElement> bagsbrand = driver.findElements(By.xpath("//h3[@class ='product-brand']"));
		List<String> brand = new ArrayList<String>();
		
		for(WebElement brands:bagsbrand) {
			brand.add(brands.getText());
		}
		
		List<WebElement> bagsname = driver.findElements(By.xpath("//h4[@class ='product-product']"));
		List<String> bagn = new ArrayList<String>();
		for(WebElement bagname:bagsname) {
			bagn.add(bagname.getText());
		}
		
		System.out.println(bagcount);
		System.out.println(brand);
		System.out.println(bagn);
//		driver.findElement(By.xpath("//input[@value= 'Backpacks' and @type='checkbox']")).click();
		
	}

}
