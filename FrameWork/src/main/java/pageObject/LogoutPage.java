package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath = "//td[@class='login_title']")
	private WebElement title;
	
	@FindBy (xpath = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
