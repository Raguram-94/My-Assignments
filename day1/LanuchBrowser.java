package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); //
		driver.manage().window().maximize();// maximize screen
		driver.get("https://www.facebook.com/"); // launch URL
		driver.findElement(By.id("email")).sendKeys("ragpriya.ragu.9");
		WebElement a = driver.findElement(By.name("pass"));
		a.sendKeys("9629877376");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000); // browser will wait for 3 sec
		driver.close();  //browser will close

	}

}
