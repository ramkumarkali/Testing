package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		WebElement from = driver.findElement(By.xpath("//input[@id = 'txtStationFrom']"));
		from.clear();
		
		from.sendKeys("MAS",Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("//input[@id = 'txtStationTo']"));
		to.clear();
		
		to.sendKeys("MDU",Keys.ENTER);
		
		WebElement uncheck = driverWait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//table[@id='tableTopMenu']/tbody)//td[@id = 'tdDateOnly']/input"))));
		uncheck.click();
		
		
		List<WebElement> trainsname = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		HashSet<String> trainset = new HashSet<>();
		HashSet<String> duplicatestrain = new HashSet<>();
		
		
		
		for(WebElement trains: trainsname) {
			if(!trainset.add(trains.getText())) {
				duplicatestrain.add(trains.getText());
			}
		}
		
		System.out.println("Train list: "+trainset);
		System.out.println("Duplicates train list: "+duplicatestrain);
		
		
	}

}
