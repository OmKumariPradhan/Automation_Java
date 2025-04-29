package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling_Traverse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		
		//website ToolsQA / Parent- Child traverse / Following Siblings from one item to other
		System.out.println(driver.findElement(By.xpath("//div[@class='row align-items-center flex-grow-1']//following-sibling::li//a[text()='Demo Site']")).getText()); 
		
		
		//Contains following sibling //sysout ctrl+space
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'row')]//following-sibling::li/a[text()='Demo Site']")).getText());
		
		//Following xpath//if there is duplicate value then put indexing method in last
		System.out.println(driver.findElement(By.xpath("//div[text()='Recent Tutorials']//following::li/a[text()='Python'][1]")).getText());
		
		
		//Child to parent Traverse //back traverse //Contains -search web element by specific text
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'row')]//parent::div[@class='row align-items-center']//li/a[text()='Demo Site']")).getText());
		driver.quit();
		
		
		
		
	}

}
