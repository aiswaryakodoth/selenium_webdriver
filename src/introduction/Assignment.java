package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");

		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("okayBtn")).click();

		WebElement staticdropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("consult");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));

		List<WebElement> cart = driver.findElements(By.xpath("//i[@class='zmdi zmdi-shopping-cart']"));
		for (int i = 0; i < cart.size(); i++) 
		{

			cart.get(i).click();

		}

		WebDriverWait s = new WebDriverWait(driver, Duration.ofSeconds(7));
		s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}
