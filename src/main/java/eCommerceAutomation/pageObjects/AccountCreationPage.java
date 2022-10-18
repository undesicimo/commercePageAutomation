package eCommerceAutomation.pageObjects;

import java.util.List;
import java.util.stream.Collectors;

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
	@FindBy(id="days")
	WebElement dropDownDay;
	@FindBy(id="months")
	WebElement dropDownDate;
	@FindBy(id="years")
	WebElement dropDownYear;
	@FindBy(id="id_state")
	WebElement dropDownState;
	@FindBy(id="id_country")
	WebElement dropDownCountry;
	@FindBy(id="company")
	WebElement companyInput;
	@FindBy(id="phone")
	WebElement homePhoneInput;
	@FindBy(xpath="//div/ol/li")
	List<WebElement> errorMessages;
	
	public void inputPersonalInformation( String firstName, String lastName, String password ) {
		mrRadioButton.click();
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		passwordInput.sendKeys(password);
	}
	public void inputOptionalFields(String company, String homephone)
	{
		companyInput.sendKeys(company);
		homePhoneInput.sendKeys(homephone);
		registerButton.click();
		
	}
	public void printRequiredErrorMsg()
	{
		errorMessages.stream().map(s->s.getText()).forEach(System.out::println);
		
	}
	public Boolean verifyErrMsg()
	{
		List <String> errMsg = errorMessages.stream().map(s->s.getText()).collect(Collectors.toList());
		Boolean verify = errMsg.get(0).contains("required");
		return verify;
	}
	
	
	public void inputAddressInformation(String address, String city, String postalcode,String phoneNumber)
	{
		addressInput.sendKeys(address);
		cityInput.sendKeys(city);
		postalcodeInput.sendKeys(postalcode);
		mobilePhoneInput.sendKeys(phoneNumber);
		
	}

	
	public void inputAccountDropdowns(int index)
	{
		Select selDropDownDay = new Select(dropDownDay);
		Select selDropDownDate = new Select(dropDownDate);
		Select selDropDownYear = new Select(dropDownYear);
		Select selDropDownState = new Select(dropDownState);
		Select selDropDownCountry = new Select(dropDownCountry);
		
		selDropDownDay.selectByIndex(index);
		selDropDownDate.selectByIndex(index);
		selDropDownYear.selectByIndex(index);
		selDropDownState.selectByIndex(index);
		selDropDownCountry.selectByIndex(index);
	}
	
	public AccountPage accountRegister()
	{
		registerButton.click();
		AccountPage accountPage = new AccountPage(driver);
		return accountPage;
	}
	
	
	
}
