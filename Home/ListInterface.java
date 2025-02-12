package week4.day1.Home;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		// search box entering bags
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		// Clicking Men
		driver.findElement(
				By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]"))
				.click();
		Thread.sleep(1000);
		// Clicking fashion bag
		// driver.findElement(By.xpath("//label[contains(@class,'facet-linkname
		// facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion
		// Bags')]")).click();
		WebElement element = driver.findElement(By.xpath(
				"//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags')]"));
		element.click();
		Thread.sleep(3000);
		WebElement itemsfound = driver.findElement(By.xpath("//div[contains(@class,'length')]"));
		System.out.println(itemsfound.getText());
		Thread.sleep(1000);
		// Find all brand names in the page
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'brand')]//strong"));

		// Use a Set to store unique brand names (using the text content)
		Set<String> brandSet = new HashSet<>();
		for (WebElement webElement : ele) {
			// Add the text of each element to the set
			brandSet.add(webElement.getText().trim()); // trim to avoid extra spaces affecting uniqueness
		}

		// Print the unique brand names
		for (String brand : brandSet) {
			System.out.println(brand);
		}
		Thread.sleep(1000);
		List<WebElement> element1 = driver.findElements(By.xpath("//div[contains(@class,'nameCls')]"));
		Set<String> bagname = new HashSet<String>();
		for (WebElement ele1 : element1) {

			bagname.add(ele1.getText().trim());
		}
		for (String bag : bagname) {
			System.out.println(bag);
		}
		driver.close();
	}

}
