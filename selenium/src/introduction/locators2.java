package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
	
		String password= getPassword(driver);
	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("rahul");	
driver.findElement(By.name("inputPassword")).sendKeys(password);
driver.findElement(By.className("signInBtn")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
driver.findElement(By.xpath("//button[text()='Log Out']")).click();
driver.close();
		
	}

	public static String getPassword(WebDriver driver)
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText= driver.findElement(By.cssSelector("form p")).getText();
		
		String[] passwordArray= passwordText.split("'");
		String password= passwordArray[1].split("'")[0];
		return password;
	}
	
	
}
