package introduction;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Httpscert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options= new ChromeOptions();
		//Proxy proxy = new Proxy();
		//proxy.setHttpProxy("Ipnumber:1414");
		//options.setCapability("proxy", proxy);
		options.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		
		
		
	}

}
