package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printnooflinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlinks = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerlinks.findElements(By.tagName("a")).size());
		WebElement columnlinks = footerlinks.findElement(By.xpath("//div/table/tbody/tr/td/ul[1]"));
		System.out.println(columnlinks.findElements(By.tagName("a")).size());

		for (int i = 1; i < columnlinks.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlinktab = Keys.chord(Keys.COMMAND, Keys.ENTER);

			columnlinks.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
