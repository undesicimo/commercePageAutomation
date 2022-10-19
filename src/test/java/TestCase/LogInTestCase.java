package TestCase;

import org.testng.annotations.Test;

import eCommerceAutomation.BaseTestComponents.BaseTestComponents;
import eCommerceAutomation.pageObjects.AccountPage;
import eCommerceAutomation.pageObjects.SignInPage;

public class LogInTestCase extends BaseTestComponents{

	@Test
	public void logInTest() 
	{
		//1.LPに遷移する
		landingPage.goToPage();
		SignInPage signInPage =landingPage.goTosignInPage();
		//2.サインインボタンを押下,
		AccountPage accountPage= signInPage.signIn("ambema@gmail.com", "12345");
		//3. アカウント情報画面に遷移確認。
		accountPage.verifyAccountPage();
		
		
		
	}
			
		
		
	

		
	
	
}
