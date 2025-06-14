package com.automation;

import java.lang.classfile.instruction.DiscontinuedInstruction.JsrInstruction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com");
        System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    
	    WebElement element = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']"));
        element.click();
        
        WebElement hyperlink = driver.findElement(By.xpath("//li[@id='menuform:m_link']"));
        hyperlink.click();
        
        driver.quit();
        
	}

}
