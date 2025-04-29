package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Select option in dropdown list
		//Dropdown with select tag
		//WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //provide the address of dropdown
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));//need to create obj to run the select method
		dropdown.selectByIndex(2); // give the option number of the index to select
		System.out.println(dropdown.getFirstSelectedOption().getText());// returns the selected option
		dropdown.selectByVisibleText("USD"); //to select one of options in a dropdown box
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR"); 
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
