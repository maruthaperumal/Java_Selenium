package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage extends BasePage{

	public SelectHotelPage(WebDriver driver) {
		super(driver);	
	}
    @FindBy (xpath = "//td[@class='login_title']")
	private WebElement title;
	
	@FindBy (xpath = "//input[contains(@name,'radiobutton_0')]")
	private WebElement radioBtn;
	
	@FindBy (xpath = "//input[contains(@name,'continue')]")
	private WebElement contnue;
	
	
	public WebElement getTitle() {
		return title;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContnue() {
		return contnue;
	}
	
}
