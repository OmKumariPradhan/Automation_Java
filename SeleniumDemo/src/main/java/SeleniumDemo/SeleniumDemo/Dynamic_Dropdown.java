package SeleniumDemo.SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//DyanmicDropdown is a dependent dropdown,to display value in second field,at first we need to fill the first field.

public class Dynamic_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // locate address of dropdown
		driver.findElement(By.xpath("//a[@value='GOI']")).click(); // select the value in first dropdown list
		Thread.sleep(2000);
		//1.With Index
		//driver.findElement(By.xpath("(//a[@value='SXR'])[2]")).click(); // select the value in second dropdown list, 
		                                                      //we will give index bcz it was showing "2 element found".
		
		//2.Without indexes , parent - child relationship
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='SXR']")).click();	}

}
