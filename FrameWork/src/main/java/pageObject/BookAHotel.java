package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAHotel extends BasePage {

	public BookAHotel(WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath = ("//td[@class='login_title'])[1]"))
	private WebElement title;
	
	@FindBy (xpath = "//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy (xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@id='cc_num']")
	private WebElement ccNo;
	
	@FindBy (xpath = "//select[@id='cc_type']")
	private WebElement ccType;
	
	@FindBy (xpath = "//select[@id='cc_exp_month']")
	private WebElement ccExpDate;
	
	@FindBy (xpath = "//select[@id='cc_exp_year']")
	private WebElement ccExpYear;
	
	@FindBy (xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy (xpath = "//input[@id='book_now']")
	private WebElement bookNowBtn;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpDate() {
		return ccExpDate;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	
}
