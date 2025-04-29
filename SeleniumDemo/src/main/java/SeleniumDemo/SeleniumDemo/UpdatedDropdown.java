package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click(); // Find the address which you want to select the element
		Thread.sleep(3000L); //put thread.sleepto avoid error "ElementNotInteractableException"
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //fetch the data before selecting 
		/*int i=1;
		while(i<5) // we will call the loop to click the element multiple time.
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++; // we will increase the i value by 1, so that will not run in infinite loop
		}*/
		//We can do it by FOR loop as well
		for(int i=0 ; i<6;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click(); 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//fetch the data after selecting

		driver.quit();
		
	}

}
