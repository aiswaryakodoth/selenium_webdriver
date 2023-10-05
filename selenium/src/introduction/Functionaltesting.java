package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Functionaltesting {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		 
		String[] items= {"Cucumber","Beetroot","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		additems(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		
	    
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='promoInfo']")));
	    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
	}
public static void additems(WebDriver driver,String[] items)
{
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	int i;
	int j = 0;
	for( i=0; i<products.size(); i++)
	{
	
	String[] name=products.get(i).getText().split("-");
	String newname=name[0].trim();
	List itemsneeded= Arrays.asList(items);


		
		if(itemsneeded.contains(newname))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
			

			if(j==items.length)
			{
				break;
			}
			}
		
	
	}
	
	
	
	
}
	
	
}
