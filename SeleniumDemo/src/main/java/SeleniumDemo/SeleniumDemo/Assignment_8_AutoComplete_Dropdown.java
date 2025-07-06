package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8_AutoComplete_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind"); // sending 3 letters to selected India
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN); // keys down //MOUSE HOVER  1st step
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN); // keys down //MOUSE HOVER  2nd step
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}
