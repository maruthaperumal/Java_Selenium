package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        driver.navigate().to("http://www.flipkart.com/");
	        Thread.sleep(2000);
	        
	        driver.navigate().back();
	        Thread.sleep(2000);
	        
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        
	        driver.navigate().refresh();
			
		}

	}

