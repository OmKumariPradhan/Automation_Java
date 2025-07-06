package SeleniumDemo.SeleniumDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class HandleScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)"); //Window scroll
		Thread.sleep(3000l);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //scroll small portion
		
		//TO GET VALUE from table column it is easy to use CSS selector
		
		List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		
		for(int i=0; i<values.size(); i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText()); //28 string to integer conversion
			
		}
		System.out.println(sum); // sum the values of the column present in the table view
		//driver.quit(); 
		
		//Parsing String and compare the generated sum values
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		//int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		//Assert.assertEquals(sum, total);
	}
   
	

}
