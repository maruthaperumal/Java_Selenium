package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.LoginPage;
import utilities.BaseClass;

public class LoginPageActions extends BaseClass {

	private WebDriver driver;

	private LoginPage lp;

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
		lp = new LoginPage(driver);
	}

	public void enterUsername (String value) {
		logger.info("In method enterUsername");
		SendKeysOnElement(lp.getUsername(), value);
		logger.info("entered Username");
	}

	public void enterPassword (String value) {
		logger.info("In method enterPasswrod");
		SendKeysOnElement(lp.getPassword(), value);
		logger.info("entered Passwrod");
	}

	public void enterLoginBtn () {
		logger.info("In method enterLoginBtn");
		ClickOnElement(lp.getLoginBtn());
		logger.info("entered LoginBtn");
	}





}


















