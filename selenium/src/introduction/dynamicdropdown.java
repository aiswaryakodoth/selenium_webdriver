package introduction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class dynamicdropdown {



public static void main(String[] args) throws InterruptedException {



WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();		
Thread.sleep(1000);	
driver.findElement(By.xpath("//a[@value='BLR']")).click();		
Thread.sleep(1000);		

driver.findElement(By.xpath(("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] "))).click();
//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
System.out.println("It is enabled");
Assert.assertTrue(true);
	
}
else
{
	Assert.assertTrue(false);
}
	}

}
