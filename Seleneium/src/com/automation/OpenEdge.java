package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
		

	}

}
