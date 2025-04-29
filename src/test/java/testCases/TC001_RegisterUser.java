package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_RegisterUser extends BaseClass {
	
	
	@Test
	void verifyAccountRegister() {
		
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		
		AccountRegistrationPage rg=new AccountRegistrationPage(driver);
		rg.selectGender("male");
		rg.setFirstName(randomString(4));
		rg.setLastName(randomString(5));
		rg.setEmail(randomString(4)+"@yomail.com");
		System.out.println(randomString(4)+"@yomail.com");
		rg.setPassword("John@123");
		rg.ConformPass("John@123");
		rg.clickRegister();
		
		String expectedMsg="Your registration completed";
		Assert.assertEquals(rg.getConfText(), expectedMsg);
		
		rg.logout();
		
	}
	

}
