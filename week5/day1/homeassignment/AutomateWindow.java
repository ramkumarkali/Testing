package week5.day1.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();
		driver.findElement(By.xpath("//a[text() = 'Merge Contacts']")).click();
		
		WebElement Fromwindow = driver.findElement(By.xpath("//table[@class = 'twoColumnForm']/tbody/tr/td[2]/a"));
		Fromwindow.click();
		
		Set<String> fromchild = driver.getWindowHandles();
		
		List<String> li = new ArrayList<>(fromchild);
		
		driver.switchTo().window(li.get(1));
		
		WebElement selectfrom = driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']/tbody/tr[1]/td[1]/div/a"));
		selectfrom.click();
		
		driver.switchTo().window(li.get(0));
		
		WebElement towindow = driver.findElement(By.xpath("//table[@class = 'twoColumnForm']/tbody/tr[2]/td[2]/a"));
		towindow.click();
		
		Set<String> tochild = driver.getWindowHandles();
		
		List<String> li2 = new ArrayList<>(tochild);
		
		driver.switchTo().window(li2.get(1));
		
		WebElement selectto = driver.findElement(By.xpath("//div[@class = 'x-grid3-body']/div[2]/table/tbody/tr/td/div/a"));
		selectto.click();
		
		driver.switchTo().window(li2.get(0));
		
		WebElement merge = driver.findElement(By.xpath("//a[text()= 'Merge']"));
		merge.click();
		
		Alert acc = driver.switchTo().alert();
		acc.accept();
		
		System.out.println(driver.getTitle());
	}

}
