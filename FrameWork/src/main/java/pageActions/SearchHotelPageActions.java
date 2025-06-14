package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.SearchHotelPage;
import utilities.BaseClass;

public class SearchHotelPageActions extends BaseClass {
	
	private WebDriver driver;
	
	private SearchHotelPage shp;
	
	public SearchHotelPageActions(WebDriver driver) {
		this.driver= driver;
		shp= new SearchHotelPage(driver);
	}
	
	public void enterTitle() {
		GetTitle();
	}
	
	public void enterLocation(int value) {
		DropdownIndex(shp.getLocation(), value);
	}
	
    public void enterHotel(int value) {
    	DropdownIndex(shp.getHotel(), value);
    }
    
    public void enterRoom(int value) {
    	DropdownIndex(shp.getRoom(), value);
    }
    
    public void enterRoomNumber(int value) {
    	DropdownIndex(shp.getRoomnumber(), value);
    }
    
    public void enterCheckInDate(String value) {
    	SendKeysOnElement(shp.getCheckInDate(), value);
    }
    
    public void enterCheckOutDate(String value) {
    	SendKeysOnElement(shp.getCheckOutDate(), value);
    }
    
    public void enterAdult (int value) {
    	DropdownIndex(shp.getAdult(), value);
    }
    
    public void enterChild (int value) {
    	DropdownIndex(shp.getChild(), value);
    }
    
    public void enterSubmit() {
    	ClickOnElement(shp.getSubmit());
    }
    
 
    
}





























