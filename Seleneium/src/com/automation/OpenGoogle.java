package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
//	1. Open Chrome
//	2. Go Goole home page	
		
//		System.setProperty("name", "location");
// Their will be the rule for open web in seleneium "webdriver.chrome.driver"
// location means location of chrome driver	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver been launched");
		driver.get("http://www.google.co.in");
	}

}
	