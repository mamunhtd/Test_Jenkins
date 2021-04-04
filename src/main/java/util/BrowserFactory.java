package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserFactory {
	
	 static WebDriver driver;
	 static String browser = "Chrome";
 //	static String browser = "Firefox";
// 	static String url = null;
	
	
	  public static WebDriver init() {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	//		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//	driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	//		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
	//		driver = new FirefoxDriver();
		}

		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	
		

	}
	  
	
	
	

}
