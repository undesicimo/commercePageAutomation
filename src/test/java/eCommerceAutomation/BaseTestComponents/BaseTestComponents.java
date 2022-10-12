package eCommerceAutomation.BaseTestComponents;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestComponents {
	WebDriver driver;
	
	public WebDriver initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		return driver;
		
	}
	public void launchBrowser()
	{
		driver = initializeWebDriver();
		driver.manage().window().maximize();
	}
}
