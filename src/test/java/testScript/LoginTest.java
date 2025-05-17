package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.TestngBase;
import pages.loginPage;
import testScript.LoginTest;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase {


	@Test(description="Verifying user login with valid credential")

	public void verifyUserCanLoginSuccessfullyLoginWithValidCredentials() throws IOException

	{
	String username=ExcelUtility.readStringData(0, 0, "LoginPage");
	String password=ExcelUtility.readStringData(0, 1, "LoginPage");		
	loginPage loginpage=new loginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnLoginButton();
	
	
	
	}
	@Test(description="Verifying user login with invalid username")
	public void loginWithIncorrectUsernameAndCorrectPassword() throws IOException
	{
		
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 2, "LoginPage");		
		loginPage loginpage=new loginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	@Test(description="Verifying user login with invalid password")
	public void loginWithCorrectUsernameAndIncorrectPassword() throws IOException
	{
		String username=ExcelUtility.readStringData(2, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 3, "LoginPage");		
		loginPage loginpage=new loginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	@Test(description="Verifying user login with invalid credential")
	public void loginWithInvalidCredentials() throws IOException
	{
		String username=ExcelUtility.readStringData(3, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 4, "LoginPage");		
		loginPage loginpage=new loginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoginTest login=new LoginTest();
		login.initializeBrowser();
		login.verifyUserCanLoginSuccessfullyLoginWithValidCredentials();
		login.loginWithCorrectUsernameAndIncorrectPassword();
		login.loginWithIncorrectUsernameAndCorrectPassword();
		login.loginWithInvalidCredentials();
		
		
}

}


