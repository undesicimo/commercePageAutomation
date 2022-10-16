package eCommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	public SignInPage(WebDriver driver)
	{
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
	
	
	
	public AccountCreationPage createAccount(String email)
	{
		createAccountEmailInput.sendKeys(email);
		createAccountSubmit.click();
		AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
		return accountCreationPage;
		
	}
	
	public void signIn(String email, String password) {
		emailAddressInput.sendKeys(email);
		passwordInput.sendKeys(password);
		submitButton.click();
		
		
	}
	
	
}
