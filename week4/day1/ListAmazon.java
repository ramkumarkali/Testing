package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);  //Keys.eenter will enter the keyboard button
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> list1 = new ArrayList<String>();
		
		
		for(WebElement list:ele) {
			String price  = list.getText();
//			price.replaceAll(",", "");
			list1.add(price);
		}
		
		System.out.println(list1);
		

	}

}
