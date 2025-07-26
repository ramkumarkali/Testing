package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowshandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text() = 'OK']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		
		WebElement ele = driver.findElement(By.xpath("//span[@class = 'allcircle circleone']/following::label[text() = 'FLIGHTS']"));
		ele.click();
		
		Set<String> child = driver.getWindowHandles();
		
		List<String> li = new ArrayList<>(child);
		
		driver.switchTo().window(li.get(1));
		
		String childwindow = driver.getWindowHandle();
		System.out.println(childwindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		driver.close();
		
		
		
		
		
		
		
	}

}
