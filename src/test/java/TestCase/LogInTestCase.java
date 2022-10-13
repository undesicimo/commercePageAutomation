package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import eCommerceAutomation.BaseTestComponents.BaseTestComponents;
import eCommerceAutomation.pageObjects.LandingPage;
import eCommerceAutomation.pageObjects.SignInPage;

public class LogInTestCase extends BaseTestComponents{

	@Test
	public void logInTest() 
	{
		//1.LPに遷移する
		landingPage.goToPage();
		SignInPage signInPage =landingPage.goTosignInPage();
		//2.サインインボタンを押下,
		signInPage.signIn("ambema@gmail.com", "12345");
		
		
		
		
	}
			
		
		
	

		
	
	
}
