package igt.tableMountain.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import igt.tableMountain.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - Object repository(OR)
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
	WebElement signinBtn;

	@FindBy(xpath = "//img[@class='login-logo']")
	WebElement igtlogo;

	// Initialize page factory/Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Methods/Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateIgtLogo() {
		return igtlogo.isDisplayed();
	}

	public SimulatorPage login(String un, String pswd) {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pswd);
		signinBtn.click();
		return new SimulatorPage();
		
	}
}
