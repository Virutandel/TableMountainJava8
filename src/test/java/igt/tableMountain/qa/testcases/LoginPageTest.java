package igt.tableMountain.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import igt.tableMountain.qa.base.TestBase;
import igt.tableMountain.qa.pages.LoginPage;
import igt.tableMountain.qa.pages.SimulatorPage;

public class LoginPageTest extends TestBase {

	public static LoginPage loginPage;
	SimulatorPage simulatorPage;

	// testBase class constructor call --> initialize configure.propert from
	// testBase class (video min = 59)
	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();

		// Create loginPage Class constructor to use method and Action (only one class
		// can extend --> base page)=
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitiletest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "M5 Simulator");
	}

	@Test(priority = 2)
	public void igtLogoTest() {
		boolean flag = loginPage.validateIgtLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() {
		simulatorPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(), "M5 Simulator");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
