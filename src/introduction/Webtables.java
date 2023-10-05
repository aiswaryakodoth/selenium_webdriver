package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> rowvalue= driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rowvalue.size());
		List<WebElement> columnvalue= driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(columnvalue.size());
		List<WebElement> s=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(s.get(0).getText());
		System.out.println(s.get(1).getText());
		System.out.println(s.get(2).getText());
		//".table-display tr:nth-child(3)")
	}

}
