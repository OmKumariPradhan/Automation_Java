package SeleniumDemo.SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();  //CHROME BROWSER LAUNCH
		//WebDriver driver = new EdgeDriver();   // EDGE BROWSER LAUNCH
		WebDriver driver = new FirefoxDriver(); // FIRFOX BROWSER LAUNCH
		
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// global wait ,Execute after every command ,to capture text
		
		driver.findElement(By.xpath("//*[text()= 'Register']")).click();  //text() method // '*' will search gobally
		driver.findElement(By.id("name")).sendKeys("Omkumari"); // name attribute
		driver.findElement(By.id("email")).sendKeys("omkumaripradhan1997@gmail.com"); //Id attribute
		driver.findElement(By.xpath("//button[@type='button']")).click(); //xpath
	    System.out.println(driver.findElement(By.cssSelector("span#my-error-id")).getText()); //Css id to retrieve message
		//System.out.println(driver.findElement(By.xpath("//span[@id='my-error-id']")).getText()); // same using xpath
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("omkumaripradhan1997@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Log in']")).click();
	    driver.findElement(By.linkText("Login with password instead")).click();
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("omkumaripradhan@gmail.com");// xpath
	    driver.findElement(By.xpath("//input[@id='email']")).clear(); //same to clear the value
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradhanomkumari1997@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Simran@13");
	    driver.findElement(By.id("remember_me")).click(); // id attribute
	    driver.findElement(By.xpath("//input[@name ='commit']")).click(); // name attribute
	}
}
