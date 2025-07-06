package SeleniumDemo.SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HandlingHTTPSCerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ChromeOptions options = new ChromeOptions();    //ChromeOptions is used to set behaviors of the browser
	options.setAcceptInsecureCerts(true); // it will accept any certs
		
	 WebDriver driver = new ChromeDriver(options);
	 driver.get("https://expired.badssl.com/");
	 System.out.println(driver.getTitle());
 
	}

}
