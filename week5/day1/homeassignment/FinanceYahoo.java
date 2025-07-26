package week5.day1.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

public class FinanceYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement marketes = driver.findElement(By.xpath("//span[text() = 'Markets']"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(marketes).perform();
		
		WebElement crytptotab = driver.findElement(By.xpath("(//li[@class = '_yb_h1s1bv'][9])/a/div[text() = 'Crypto']"));
		
		crytptotab.click();
		
		List<WebElement> crytponames = driver.findElements(By.xpath("//table[@class = 'yf-ao6als bd']/tbody/tr/td[2]"));
		
		List<String> li = new ArrayList<String>();
		
		for(WebElement listname:crytponames) {
			li.add(listname.getText());
		}
		
		System.out.println(li);
		
		
		
	}

}
