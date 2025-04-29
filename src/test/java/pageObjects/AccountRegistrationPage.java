package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	

@FindBy(xpath="//input[@id='gender-male']") WebElement radiomale;
@FindBy(xpath="//input[@id='gender-female']") WebElement radiofemale;
@FindBy(xpath="//input[@id='FirstName']") WebElement txtfirstName;
@FindBy(xpath="//input[@id='LastName']") WebElement txtlastName;
@FindBy(xpath="//input[@id='Email']") WebElement txtemail;
@FindBy(xpath="//input[@id='Password']") WebElement txtpassword;
@FindBy(xpath="//input[@id='ConfirmPassword']") WebElement txtconfirmPassword;
@FindBy(xpath="//input[@id='register-button']") WebElement btnregister;
@FindBy(xpath = "//div[contains(text(),'registration completed')]") WebElement conformationmsg;
@FindBy(xpath="//a[normalize-space()='Log out']") WebElement logOut;
	

	public void setPassword(String password) {
		txtpassword.sendKeys(password);
	}
	
	public void ConformPass(String password) {
		txtconfirmPassword.sendKeys(password);
	}
	
	public void setFirstName(String Fname) {
		txtfirstName.sendKeys(Fname);
	}
	
	public void setLastName(String Lname)
	{
		txtlastName.sendKeys(Lname);
	}
	
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}


	public void clickRegister()
	{
		btnregister.click();
	}
	
	public String getConfText() {
		
		return conformationmsg.getText();
	}
	@Parameters({"gender"})
	public void selectGender(String gender) {
		String male="male";
		String female="female";
		if (gender.toLowerCase().equals(male)) {
			radiomale.click();
		}
		else if (gender.toLowerCase().equals(female)) {
			radiofemale.click();
		}
	}
	
	public void logout() {
		logOut.click();
	}
	
}
	
	
