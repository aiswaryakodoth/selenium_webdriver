package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows1=driver.getWindowHandles();
		Iterator<String> it1=windows1.iterator();
		String parent1=it1.next();
		String child1=it1.next();
		driver.switchTo().window(child1);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(parent1);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		
		
		
	}

}
