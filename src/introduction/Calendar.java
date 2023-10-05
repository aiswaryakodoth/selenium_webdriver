package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);

		// WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(7));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='form-field-travel_comp_date']")));

		// Actions action= new Actions(driver);
		// WebElement
		// move=driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		// action.moveToElement(move).click().build().perform();
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();

		while (!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("September"))
			
		{
		
		
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			Thread.sleep(3000);
		}

		List<WebElement> dates=driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));

		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
		for (int i = 0; i < count; i++) 
		{
			String text = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();

			if (text.equalsIgnoreCase("23")) 
			{
				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
				System.out.println("The selected day is:" + text);

				break;
			}

		}
	}

}
