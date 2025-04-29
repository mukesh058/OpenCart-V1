package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement lnkRegister;
	@FindBy(xpath = "//a[normalize-space()='Log in']") WebElement lnkLogin;
	
	
	public void clickRegister()
	{
		lnkRegister.click();
		
	}
	
	public void clickloginLink() {
		lnkLogin.click();
	}

}
