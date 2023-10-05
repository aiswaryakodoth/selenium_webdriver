package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");

driver.findElement(By.name("name")).sendKeys("ca14");
driver.findElement(By.name("email")).sendKeys("ca14@gmail.com");
driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc");
driver.findElement(By.id("exampleCheck1")).click();

WebElement staticdropdown= driver.findElement(By.id("exampleFormControlSelect1"));
Select dropdown= new Select(staticdropdown);
dropdown.selectByVisibleText("Female");

driver.findElement(By.id("inlineRadio1")).click();
driver.findElement(By.name("bday")).sendKeys("24/08/1995");
driver.findElement(By.cssSelector("input[type='submit']")).click();
System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
	}

}
