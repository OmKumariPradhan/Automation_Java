package SeleniumDemo.SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {

	public static void main(String[] args) {
		//Launch the Firefox browser
		//WebDriverManager.getInstance(FirefoxDriver.class).setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/");
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		driver.getCurrentUrl();
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
//		
		// Launch Edge browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.quit();		

	}

}
