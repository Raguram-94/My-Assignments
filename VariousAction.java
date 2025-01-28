package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousAction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); // using id locator will enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // using id locator will enter 
		driver.findElement(By.className("decorativeSubmit")).click(); // perform click action by using classname locator
		driver.findElement(By.linkText("CRM/SFA")).click(); // perform click action by using linktext locator
		driver.findElement(By.linkText("Create Account")).click(); //perform click action by using linktext locator
		driver.findElement(By.id("accountName")).sendKeys("Ragurammm");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title); // getting title in console
		driver.close();

	}

}
