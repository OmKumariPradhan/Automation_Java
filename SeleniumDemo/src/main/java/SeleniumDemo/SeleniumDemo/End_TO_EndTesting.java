package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class End_TO_EndTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // locate address of dropdown
		driver.findElement(By.xpath("//a[@value='GOI']")).click(); // select the value in first dropdown list
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='SXR']")).click();
		driver.findElement(By.xpath("//a[@class= 'ui-state-default ui-state-active']")).click();
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) // when its 1 then will return true
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click(); // Find the address which you want to select the element
		Thread.sleep(3000L);

		for(int i=0 ; i<6;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click(); 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//fetch the data after selecting

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}

}
