package week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Rampooja001");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(sourceDD );
		sel.selectByIndex(3);
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(owner);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement sorceee = driver.findElement(By.name("dataSourceId"));
		Select sel3 = new Select(sorceee);
		sel3.selectByVisibleText("Employee");
		
		WebElement market = driver.findElement(By.name("marketingCampaignId"));
		Select sel4 = new Select(market);
		sel4.selectByIndex(7);
		
		WebElement state  = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5 = new Select(state);
		sel5.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title  = driver.getTitle();
		
		if(title.equals(driver.getTitle())){
			System.out.println(title+" Title dispalyed correctly");
		}
		else {
			System.out.println("Title not displayed properly");
		}
		
	}

}
