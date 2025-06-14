package Project.Ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceBooking {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\eclipse-workspace\\Seleneium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[contains(@class,\"ico-login\")]")).click();
	driver.findElement(By.xpath("//input[contains(@name,\"Email\")]")).sendKeys("mptcf@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,\"Password\")]")).sendKeys("mptcf@123");
	driver.findElement(By.xpath("//button[contains(@class,\"button-1 login-button\")]")).click();
	
	
		


	}

}
