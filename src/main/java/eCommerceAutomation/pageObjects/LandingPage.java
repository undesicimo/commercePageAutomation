package eCommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
		WebDriver driver;
		
	public LandingPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(className="login")
	WebElement loginButton;
	
	public void goToPage() {
		driver.get("http://automationpractice.com/index.php");
		}
	
	
	public SignInPage goTosignInPage() {
		SignInPage signInPage = new SignInPage(driver);
		loginButton.click();
		return signInPage;
		
	}
	
	
}
