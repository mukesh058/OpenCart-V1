package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	void loginTest()
	{
		HomePage hp=new HomePage(driver);
		hp.clickloginLink();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("NNYG@yopmail.com");
		lp.enterPassword("John@123");
		lp.clickLoginBtn();
	}

}
