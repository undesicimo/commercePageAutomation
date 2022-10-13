package TestCase;

import org.testng.annotations.Test;

import eCommerceAutomation.BaseTestComponents.BaseTestComponents;
import eCommerceAutomation.pageObjects.SignInPage;

public class UserRegistration extends BaseTestComponents{
	
	@Test
	public void userRegistration() {
		//1.LPに遷移する
				landingPage.goToPage();
				SignInPage signInPage =landingPage.goTosignInPage();
		
		
	}
	
}
