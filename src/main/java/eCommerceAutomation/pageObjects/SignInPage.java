package eCommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="email")
	WebElement emailAddressInput;
	@FindBy(id="passwd")
	WebElement passwordInput;
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	@FindBy(id="email_create")
	WebElement createAccountEmailInput;
	@FindBy(id="SubmitCreate")
	WebElement createAccountSubmit;
	
	
	
	public void createAccount()
	{
		createAccountEmailInput.sendKeys("ambe@gmail.com");
		createAccountSubmit.click();
		
	}
	
	public void signIn(String email, String password) {
		emailAddressInput.sendKeys(email);
		passwordInput.sendKeys(password);
		submitButton.click();
	}
	
	
}
