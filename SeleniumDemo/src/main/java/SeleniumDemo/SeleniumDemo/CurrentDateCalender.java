package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDateCalender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//FROM 
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // locate address of dropdown
		driver.findElement(By.xpath("//a[@value='GOI']")).click(); // select the value in first dropdown list
		Thread.sleep(2000);
		
		//TO
		driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
		
		//CURRENT DATE 
		driver.findElement(By.xpath("//a[@class= 'ui-state-default ui-state-active']")).click();
		
	}

}
