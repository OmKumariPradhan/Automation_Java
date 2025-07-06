package SeleniumDemo.SeleniumDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssignment_7 {
	
	public static void main(String[] args) 
	{
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
   WebElement table= driver.findElement(By.xpath("//table[@id='product']"));  //To find the location of the table:
   System.out.println("Row count::"+ table.findElements(By.tagName("tr")).size()); // count of row
   
   System.out.println("Column count: "+ table.findElements(By.tagName("th")).size()); // count of column
   
   List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")); // second row data
   
   System.out.println(secondrow.get(0).getText());
   System.out.println(secondrow.get(1).getText());
   System.out.println(secondrow.get(2).getText());

	}
}