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
	@FindBy(xpath="//div[@id='create_account_error']/ol/li")
	WebElement emailAddressError;
	
	
	
	public AccountCreationPage createAccount(String email)
	{
		createAccountEmailInput.sendKeys(email);
		createAccountSubmit.click();
		AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
		return accountCreationPage;
		
	}
	
	public String getErrorMessage()
	{
		System.out.println(emailAddressError.getText());
		String errorMessage = emailAddressError.getText();
		return errorMessage;
	}
	
	public AccountPage signIn(String email, String password) {
		emailAddressInput.sendKeys(email);
		passwordInput.sendKeys(password);
		submitButton.click();
		AccountPage accountPage = new AccountPage(driver);
		return accountPage;
		
		
	}
	
	
}
