package TestCase;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.Test;

import eCommerceAutomation.BaseTestComponents.BaseTestComponents;
import eCommerceAutomation.pageObjects.AccountCreationPage;
import eCommerceAutomation.pageObjects.AccountPage;
import eCommerceAutomation.pageObjects.SignInPage;

public class UserRegistration extends BaseTestComponents{
	
	@Test
	public void userRegistration() throws InterruptedException {
		
				//1.LPに遷移する
				landingPage.goToPage();
				SignInPage signInPage =landingPage.goTosignInPage();
				//2.サインインボタンを押下,
				//3.サインイン画面のアカウント登録部分にてをemail入力
				//4.アカウント登録ボタンを押下
				AccountCreationPage accountCreationPage = signInPage.createAccount("am513515@gmail.com");
				//5.アカウント登録画面、登録内容の入力
				//6.アカウント登録ボタンを押下
				accountCreationPage.inputPersonalInformation("Josh", "Ma", "12345");
				accountCreationPage.inputAddressInformation("Street123", "City", "12345", "12345");
				accountCreationPage.inputAccountDropdowns(1);
				AccountPage accountPage = accountCreationPage.accountRegister();
				//7.アカウント登録完了ページを確認。
				accountPage.verifyAccountPage();
	}
	@Test
	public void userRegistrationError()
	{
				landingPage.goToPage();
				SignInPage signInPage =landingPage.goTosignInPage();
				//2.サインインボタンを押下,
				//3.サインイン画面のアカウント登録部分にてをemail入力
				//4.アカウント登録ボタンを押下
				signInPage.createAccount("123");
				//5.無効なEmailエラーメッセージの確認
				assertTrue(signInPage.getErrorMessage().contains("Invalid"));
				
	}
	@Test
	public void userRegistrationFieldsVerify()
	{
		//1.LPに遷移する
		landingPage.goToPage();
		SignInPage signInPage =landingPage.goTosignInPage();
		//2.サインインボタンを押下,
		//3.サインイン画面のアカウント登録部分にてをemail入力
		//4.アカウント登録ボタンを押下
		AccountCreationPage accountCreationPage = signInPage.createAccount("am13515@gmail.com");
		accountCreationPage.inputOptionalFields("human", "12345");
		accountCreationPage.printRequiredErrorMsg();
		Assert.assertTrue(accountCreationPage.verifyErrMsg());
	}
}
