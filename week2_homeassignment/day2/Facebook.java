package week2.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ramk");
		driver.findElement(By.name("lastname")).sendKeys("poojaa");
		driver.findElement(By.name("reg_email__")).sendKeys("krkramyaa@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ramk@2000");
		WebElement day = driver.findElement(By.id("day"));
		Select sel=new Select(day );
		sel.selectByIndex(4);
		
		WebElement day2 = driver.findElement(By.id("month"));
		Select sel2=new Select(day2 );
		sel2.selectByVisibleText("May");
		
		WebElement day3 = driver.findElement(By.id("year"));
		Select sel3=new Select(day3 );
		sel3.selectByVisibleText("2001");
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		radio.click();
	}

}
