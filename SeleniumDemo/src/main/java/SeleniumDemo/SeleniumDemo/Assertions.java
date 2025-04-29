package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//ASSERTIONS- FALSE //  The statement is FALSE, so it will return false
		Assert.assertFalse((driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).isSelected())); 
	 	 //it will check that checkbox is selected or not
		
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click(); //click the check box //Regular Expression
		
		//System.out.println(driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).isSelected()); //check the checkbox is selected or not.
		
		//ASSERTIONS- TRUE //  The statement is True, so it will return True
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).isSelected()); //it will check that checkbox is selected or not and return TRUE or FALSE
		
		//Count the CHECK BOXes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // getting more than 1 elements so used "findElements".
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		
		//ASSERTIONS - EQUALS 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //fetch the data before selecting 
	
		for(int i=0 ; i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//fetch the data after selecting
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
