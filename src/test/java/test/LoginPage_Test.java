package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Login_Page;
import util.BrowserFactory;

public class LoginPage_Test {

	 static WebDriver driver;

	Login_Page login_Page;

	@BeforeMethod
	public void beforeRun() {

		driver = BrowserFactory.init();
		login_Page = PageFactory.initElements(driver, Login_Page.class);
	}
	
	@Test
	public void login_Test() throws Exception {
		
		login_Page.insertUserName("demo@techfios.com");
		login_Page.insertPassword("abc123");
		login_Page.clickSigninButton();
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
