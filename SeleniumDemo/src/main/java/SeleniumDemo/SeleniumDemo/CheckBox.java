package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).isSelected());//it will check that checkbox is selected or not
		
		driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).click(); //click the check box //Regular Expression
		
		//Check the check box whether its clicked or not,
		System.out.println(driver.findElement(By.cssSelector("input[name*='chk_IndArm']")).isSelected());//it will check that checkbox is selected or not and return TRUE or FALSE
		
	
		
	}

}
