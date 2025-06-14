package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage extends BasePage {

	public SearchHotelPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//td[@class='login_title']")
	private WebElement title;
	
	@FindBy (xpath = "(//select[contains(@class,\"search_combobox\")])[1]")
	private WebElement location;
	
	@FindBy (xpath = "(//select[contains(@class,\"search_combobox\")])[2]")
	private WebElement hotel;
	
	@FindBy (xpath = "(//select[contains(@class,\"search_combobox\")])[3]")
	private WebElement room;
	
	@FindBy (xpath = "(//select[contains(@class,\"search_combobox\")])[4]")
	private WebElement roomnumber;
	
	@FindBy (xpath = "//*[(@id='datepick_in')]/../../td/input" )
	private WebElement checkInDate;
	
	@FindBy (xpath = "//*[(@id='datepick_out')]/../../td/input")
	private WebElement checkOutDate;
	
	@FindBy (xpath = "//select[@id='adult_room']")
	private WebElement adult;
	
	@FindBy (xpath = "//select[@id='child_room']")
	private WebElement child;
	
	@FindBy (xpath = "//input[contains(@name,'Submit')]")
	private WebElement submit;

	public WebElement getTitle() {
		return title;
	}
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
    
}
