package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleViaFireFox {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.Google.co.in");
		
	}

}




