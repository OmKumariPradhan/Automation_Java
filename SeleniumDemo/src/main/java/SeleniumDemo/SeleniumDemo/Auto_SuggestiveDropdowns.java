package SeleniumDemo.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_SuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Can"); //Provide input  to search options
		Thread.sleep(3000); //it will take some time to open the searched option in list
		List <WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // CSS selector parent-child. store the search option in LIST and try to match it
		
		for(WebElement option: options) // it will check the "Can" and store in 'option'.
		{
			if(option.getText().equalsIgnoreCase("Canada")) // fetch the option text and match with the actual search
			{
				option.click();
				break;
			}
		}

	}

}
