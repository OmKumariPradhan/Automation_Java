package SeleniumDemo.SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhtp:www.google.com");
		driver.navigate().to("https://www.toolsqa.com/"); // Navigate () has diffferent methods to peform like, back, referesh etc
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
		
		
	}

}
