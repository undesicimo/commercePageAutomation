package eCommerceAutomation.BaseTestComponents;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import eCommerceAutomation.pageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestComponents  {
	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeWebDriver()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public LandingPage launchBrowser() 
	{
		driver = initializeWebDriver();
		landingPage = new LandingPage(driver);
		landingPage.goToPage();
		return landingPage;
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeDriver()
	{
		driver.close();
	}
}
