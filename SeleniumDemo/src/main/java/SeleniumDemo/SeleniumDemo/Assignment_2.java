package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//label[text()='Name']//following::input[1]")).sendKeys("Om Kumari Pradhan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pradhanomkumari1997@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Simran@13");
		
		//CHECK BOX
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='exampleCheck1']")).isSelected());
		
		//SELECT
		Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("08-13-1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
		//Alert alert= driver.switchTo().alert();
		String zee=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(zee);

		driver.quit();
		
	}

}
