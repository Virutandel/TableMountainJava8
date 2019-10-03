package igt.tableMountain.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import igt.tableMountain.qa.base.TestBase;

public class SimulatorPage extends TestBase {

	// Page Factory - Object repository(OR)
	@FindBy(xpath = "//h1[contains(text(),'Simulator Commands')]")
	WebElement imgSimulatorCommand;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement sendToClients;

	@FindBy(id = "data-test-loadContent1")
	WebElement loadContent;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBox;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement openLocalTestConnectionBtn;

	@FindBy(xpath = "//input[@class='ng-valid ng-dirty ng-valid-parse ng-empty ng-touched']")
	WebElement LogHeartbeatsCheckBox;

}
