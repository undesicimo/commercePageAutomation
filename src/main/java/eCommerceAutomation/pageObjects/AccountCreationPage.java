package eCommerceAutomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage {
		WebDriver driver;
		
	public AccountCreationPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="id_gender1")
	WebElement mrRadioButton;
	@FindBy(id="id_gender2")
	WebElement mrsRadioButton;
	@FindBy(id="customer_firstname")
	WebElement firstNameInput;
	@FindBy(id="customer_lastname")
	WebElement lastNameInput;
	@FindBy(id="passwd")
	WebElement passwordInput;
	@FindBy(id="address1")
	WebElement addressInput;
	@FindBy(id="city")
	WebElement cityInput;
	@FindBy(id="postcode")
	WebElement postalcodeInput;
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneInput;
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	Select dropDownDay = new Select(driver.findElement(By.id("days")));
	Select dropDownDate = new Select(driver.findElement(By.id("months")));
	Select dropDownYear = new Select(driver.findElement(By.id("years")));
	Select dropDownState = new Select(driver.findElement(By.id("id_state")));
	Select dropDownCountry = new Select(driver.findElement(By.id("id_country")));
	 
	public void inputPersonalInformation( String firstName, String lastName, String password ) {
		mrRadioButton.click();
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		passwordInput.sendKeys(password);
		dropDownDay.selectByIndex(1);
		dropDownDate.selectByIndex(1);
		dropDownState.selectByIndex(1);
		dropDownCountry.selectByIndex(1);
	}
	
		
	
	
	
}
