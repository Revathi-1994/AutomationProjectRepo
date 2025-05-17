package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.TestngBase;
import pages.HomePage;
import pages.loginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestngBase {
	@Test
	public void verifyWhetherUseridAbleToSuccessfullLogoutFromHomePage() throws IOException {
		
		String username=ExcelUtility.readStringData(0, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 1, "LoginPage");		
		loginPage loginpage=new loginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		HomePage homepage=new HomePage(driver);
		homepage.clickOnAdminLink();
		homepage.clickOnLogoutLink();
	}

}
