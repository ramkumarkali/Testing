package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest"); // for security 
		ChromeDriver driver = new ChromeDriver(options); //load the driver
		driver.get("http://leaftaps.com/opentaps/"); // load the url
		driver.manage().window().maximize(); //maximize the window
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); //enter the user name
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter the password
		driver.findElement(By.className("decorativeSubmit")).click(); //click on submit
		driver.findElement(By.partialLinkText("CRM")).click(); // click on the crm
		driver.findElement(By.linkText("Leads")).click(); // click on leads
		driver.findElement(By.linkText("Create Lead")).click(); // click on create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ramk");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pooja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("k");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("rampojaaaaa");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if(title.equals(driver.getTitle())){
			System.out.println(title+" Title dispalyed correctly");
		}
		else {
			System.out.println("Title not displayed properly");
		}
	}

}
