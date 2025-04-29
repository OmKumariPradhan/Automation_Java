package SeleniumDemo.SeleniumDemo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsInCart_Ecommerce {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Putting WAITS // IMPLICIT WAITS
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); // Defining Explicit wait, you need to create an object for that
		
		String[] AddItems= {"Beetroot","Cucumber","Brocolli", "Brinjal"}; //Define array items to click on add to cart 
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		add(driver,AddItems);  //called static method  // DEVELOPED Built UTILITY. 
		
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy"); // we have to put waits to locate this
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText()); 
		
	}
	
	  public static void  add(WebDriver driver, String[] AddItems)
	  { 	
		  int j=0;
	      List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
			for(int i=0;i<products.size();i++)
			{
				String[] name = products.get(i).getText().split("-"); //Fetch the actual item name of the products, split the items without whitespace
			    String formattedName=name[0].trim(); //trim() will remove the whitespace of both left and right side.
			    
				List itemNeededList = Arrays.asList(AddItems);//Convert array into ArrayList
			
				if(itemNeededList.contains(formattedName)) //compare the value of fetched data and formatted items names
				{
					j++;
					//Click on add to cart button 
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					if(j==AddItems.length) //size of the array items
					{
						break;
					}
				}
				
	
	        }
	  }

}
