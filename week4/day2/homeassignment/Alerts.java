package week4.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[@class='card'])[5]/button")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("HiHello");
		prompt.dismiss();
		System.out.println(driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		
		driver.quit();

	}

}
