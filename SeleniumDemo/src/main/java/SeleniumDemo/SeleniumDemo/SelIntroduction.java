package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction
{

	public static void main(String[] args) 
	{
		//Invoking Browser or Launch the browser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rghos\\OneDrive\\Documents\\chrome-headless-shell.exe");
		
		//Chrome Launch
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com"); // it will only hit the link to open
		//driver.navigate().to("https://rahulshettyacademy.com"); //It has multiple methods like <,>,refresh, URL. 
		//driver.navigate().refresh();
		//driver.get.refresh(); It does not contain refresh() method.
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	    //driver.close(); // close the current browser
		driver.quit(); // closes all the instances of the browser
}
}
