package eCommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage {
		WebDriver driver;
		
	public AccountPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(css="p[class='info-account']")
	WebElement welcomeMessage;
	
	public void verifyAccountPage()
	{
		Assert.assertTrue(welcomeMessage.getText().contains("Welcome"));
			
	}
	
	
}
