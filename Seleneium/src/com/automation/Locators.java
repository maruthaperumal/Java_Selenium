package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com");
        System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    
	    WebElement element = driver.findElement(By.id("menuform:j_idt40"));
	    element.click();
	    
	    WebElement hyperlink = driver.findElement(By.id("menuform:m_link"));
	    hyperlink.click();
	    
	    WebElement dashboard  = driver.findElement(By.linkText("Go to Dashboard"));
	    dashboard.click();
	    driver.navigate().back(); 
	    
	    
	    WebElement partialLink = driver.findElement(By.partialLinkText("How many links"));
	    partialLink.click();
	
	    
	
	}

}
