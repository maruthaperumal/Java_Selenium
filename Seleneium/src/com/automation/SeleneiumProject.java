package com.automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleneiumProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com");
        System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	  
	    WebElement browser = driver.findElement(By.xpath("//li[@id=\"menuform:j_idt39\"]"));
        browser.click();
     
        WebElement alert = driver.findElement(By.xpath("//li[@id=\"menuform:m_overlay\"]"));
        alert.click();
        
        WebElement simpleAlert = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
        simpleAlert.click();
        
        Thread.sleep(2000);
        
        Alert a = driver.switchTo().alert();
        String Text = a.getText();
        a.accept();
        System.out.println(Text);
        
        Thread.sleep(2000);
        
        
        WebElement confirmAlert = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
        confirmAlert.click();
        System.out.println(a.getText());
        a.accept();
        WebElement result = driver.findElement(By.xpath("//span[@id=\"result\"]"));
        System.out.println(result.getText());
        
        Thread.sleep(2000);
        
        WebElement dismiss = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
        dismiss.click();
        System.out.println(a.getText());
        a.dismiss();
        WebElement result1 = driver.findElement(By.xpath("//span[@id=\"result\"]"));
        System.out.println(result1.getText());
        
        Thread.sleep(2000);
        
        WebElement prompt = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[6]"));
        prompt.click();
        a.sendKeys("Madhan");
        a.accept();
        WebElement result2 = driver.findElement(By.xpath("//span[@id=\"confirm_result\"]"));
        System.out.println(result2.getText());
        
        Thread.sleep(2000);
        
	    WebElement element = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']"));
        element.click();
        
        WebElement hyperlink = driver.findElement(By.xpath("//li[@id='menuform:m_link']"));
        hyperlink.click();
        
        WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
        dashboard.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(2000);
        
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,-1000);");
        
        driver.quit();

	}

}
