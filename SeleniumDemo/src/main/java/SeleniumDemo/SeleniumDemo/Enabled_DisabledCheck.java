package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enabled_DisabledCheck {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//TO Pull the value from the attribute
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")); //pull the value from attribute "Style" 
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//TO Pull the value from the attribute
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")); //pull the value from attribute "Style" 
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) // when its 1 then will return true
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
