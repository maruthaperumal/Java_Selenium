package pageActions;

import org.openqa.selenium.WebDriver;

import pageObject.LogoutPage;
import utilities.BaseClass;

public class LogoutPageAction extends BaseClass {
	
	private WebDriver driver;
	
	private LogoutPage lpg;
	
	public LogoutPageAction (WebDriver driver) {
		this.driver= driver;
		lpg= new LogoutPage(driver);
	}
	
	public void enterTitle() {
		GetTitle();
	}
	
	public void enterLogout () {
		ClickOnElement(lpg.getLogout());
	}
	

}
