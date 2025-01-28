package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadsAdding {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); // using id locator will enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // using id locator will enter 
		driver.findElement(By.className("decorativeSubmit")).click(); // perform click action by using classname locator
		driver.findElement(By.linkText("CRM/SFA")).click(); // perform click action by using linktext locator
		driver.findElement(By.partialLinkText("Create")).click();	
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ragu");  // Using Xpath id locators
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("ram"); // using xpath contains
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XYZ Softtech");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Leadscreation");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title); // getting title in console
		driver.close();
		
	}

}
