package introduction;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.manage().window().maximize();

        // Scroll down to the desired section of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(3000);

        // Click on the travel companion date input field
        WebElement dateInput = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
        dateInput.click();

        // Specify the target month and year
        String targetMonth = "September";
       // String targetYear = "2023";

        // Locate the next month button
        WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='flatpickr-next-month']"));

        // Loop until the target month and year are found
        while (true) {
            // Read the current month and year from the calendar
            WebElement currentMonthElement = driver.findElement(By.xpath("//span[@class='cur-month']"));
           // WebElement currentYearElement = driver.findElement(By.xpath("//span[@class='cur-year']"));
            String currentMonth = currentMonthElement.getText();
            //String currentYear = currentYearElement.getText();

            // Compare the current month and year with the target month and year
            if (currentMonth.equalsIgnoreCase(targetMonth) ) {
                break; // Exit the loop if the target month and year are found
            }

            // Click on the next month button to navigate to the next month
            nextMonthButton.click();
            Thread.sleep(1000); // Add a small delay to allow the calendar to update
        }

        // Find and click on the specific date within the target month
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
