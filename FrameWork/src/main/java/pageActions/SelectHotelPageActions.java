package pageActions;

import org.openqa.selenium.WebDriver;

import pageObject.SelectHotelPage;
import utilities.BaseClass;

public class SelectHotelPageActions extends BaseClass {
	
	private WebDriver driver;
	
	private SelectHotelPage schp;
	
	public SelectHotelPageActions (WebDriver driver) {
		this.driver= driver;
		schp= new SelectHotelPage(driver);
	}

    public void selectTitle() {
    	GetTitle();
    }
    
    public void selectRadioBtn() {
    	ClickOnElement(schp.getRadioBtn());
    }
    
    public void selectContinue() {
    	ClickOnElement(schp.getContnue());
    }
}
