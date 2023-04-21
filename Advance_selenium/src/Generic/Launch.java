package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch {
	WebDriver driver;
	@BeforeMethod
	void openApp() {
		System.setProperty("Webdriver.gecko.diver","./softwares.gecko.driver");
		driver=new FirefoxDriver();
		driver.get("www.facebook.com");
	}
		@AfterMethod
	void closeApp() {
	
		driver.close();
		}
}
