package com.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageActions.LoginPageActions;
import pageObject.LoginPage;
import pageObject.SearchHotelPage;

public class LoginTest {
	
	public static void main (String[] args) throws InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pc\\\\eclipse-workspace\\\\Seleneium\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		LoginPage lp = new LoginPage (driver);
		LoginPageActions lpa = new LoginPageActions(driver);
		lpa.enterUsername("maruthatcf");
		lpa.enterPassword("mptcf@2309");
		lpa.enterLoginBtn();
		
		SearchHotelPage shp = new SearchHotelPage (driver);
//		lp.getUsername().click();
//		lp.getUsername().sendKeys("maruthatcf");
//		lp.getPassword().click();
//		lp.getPassword().sendKeys("mptcf@2309");
//		lp.getLoginBtn().click();
		
		
		String title = shp.getTitle().getText();
		if (title.contains("Welcome to Adactin Group of Hotels")) {
			System.out.println("User Succesfully Logged In");
		}
		
		WebElement location = driver.findElement(By.xpath("(//select[contains(@class,\"search_combobox\")])[1]"));
		location.click();
		Select s = new Select(location);
		s.selectByIndex(5);
		location.click();
		
		Thread.sleep(2000);
		
		WebElement hotel = driver.findElement(By.xpath("(//select[contains(@class,\"search_combobox\")])[2]"));
		hotel.click();
		Select h = new Select(hotel);
	    h.selectByIndex(3);
		hotel.click();
		Thread.sleep(2000);
		
		WebElement room = driver.findElement(By.xpath("(//select[contains(@class,\"search_combobox\")])[3]"));
		room.click();
		Select r = new Select(room);
		r.selectByIndex(3);
		room.click();
		
		WebElement roomnumber = driver.findElement(By.xpath("(//select[contains(@class,\"search_combobox\")])[4]"));
		roomnumber.click();
		Select rm = new Select(roomnumber);
		rm.selectByIndex(2);
		roomnumber.click();
		
		WebElement checkindate = driver.findElement(By.xpath("//*[(@id='datepick_in')]/../../td/input"));
		checkindate.click();
		checkindate.clear();
		checkindate.sendKeys("10/05/2025");
		Thread.sleep(1000);
		
		WebElement checkoutdate = driver.findElement(By.xpath("//*[(@id='datepick_out')]/../../td/input"));
		checkoutdate.click();
		checkoutdate.clear();
		checkoutdate.sendKeys("11/05/2025");
		
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		adult.click();
		Select a = new Select(adult);
		a.selectByIndex(2);
		adult.click();
		
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select c = new Select(child);
		c.selectByIndex(1);
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@name,'Submit')]"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[contains(@name,'radiobutton_0')]"));
		radiobutton.click();
		
		WebElement cont = driver.findElement(By.xpath("//input[contains(@name,'continue')]"));
		cont.click();
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.click();
		firstname.sendKeys("MARUTHA PERUMAL");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.click();
		lastname.sendKeys("M");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.click();
		address.sendKeys("7,SA st, PNpalayam, CBE");
		
		WebElement cc = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cc.click();
		cc.sendKeys("5555 6666 7777 8888");
		
		WebElement cctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cctype.click();
		Select type = new Select(cctype);
		type.selectByIndex(2);
		cctype.click();
		
		WebElement ccexp = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		ccexp.click();
		Select exp = new Select(ccexp);
		exp.selectByIndex(9);
		ccexp.click();
		
		WebElement ccexpyr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		ccexpyr.click();
		Select expyr = new Select(ccexpyr);
		expyr.selectByIndex(16);
		ccexpyr.click();
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.click();
		cvv.sendKeys("999");
		
		Thread.sleep(1000);
		
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		logout.click();
		Thread.sleep(2000);
		
		driver.quit();
	}
	
}	

	
