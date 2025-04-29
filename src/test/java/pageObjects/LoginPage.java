package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='Email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@id='Password']") WebElement txtPassword;
	@FindBy(xpath="//input[@id='RememberMe']") WebElement rememberMe;
	@FindBy(xpath="//a[normalize-space()='Forgot password?']") WebElement lnkForgotPassword;
	@FindBy(xpath="//input[@value='Log in']") WebElement btnLogIn;

	
	public void enterUsername(String username)
	{
		txtEmail.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	public void clickLoginBtn()
	{
		btnLogIn.click();
	}
}
