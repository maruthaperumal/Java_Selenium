package pageActions;

import org.openqa.selenium.WebDriver;

import pageObject.BookAHotel;
import utilities.BaseClass;

public class BookAHotelActions extends BaseClass {
	
	private WebDriver driver;
	
	private BookAHotel bah;
	
	public BookAHotelActions (WebDriver driver) {
		this.driver= driver;
		bah = new BookAHotel(driver);
	}
	
	public void enterTitle() {
		GetTitle();
	}
	
	public void enterFirstName(String value) {
		SendKeysOnElement(bah.getFirstName(), value);
	}
	
	public void enterLastName(String value) {
		SendKeysOnElement(bah.getLastName(), value);
	}
	
	public void enterAddress(String value) {
		SendKeysOnElement(bah.getAddress(), value);
	}
	
	public void enterCcNumber(String value) {
		SendKeysOnElement(bah.getCcNo(), value);
	}
	
	public void enterCcType(int value) {
		DropdownIndex(bah.getCcType(), value);
	}
	
	public void enterCcExp (int value) {
		DropdownIndex(bah.getCcExpDate(), value);
	}
	
	public void enterCcExpYr (int value) {
		DropdownIndex(bah.getCcExpYear(), value);
	}

	public void enterCVV (String value) {
		SendKeysOnElement(bah.getCvv(), value);
	}
	
	public void enterBookNowBtn () {
		ClickOnElement(bah.getBookNowBtn());
	}
}























