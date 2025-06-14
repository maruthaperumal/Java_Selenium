package utilities;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	private static WebDriver driver;
	
	public static final Logger logger = LogManager.getLogger(BaseClass.class);
	
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		
	return driver;	
	}
	
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	
	public static void Maximize() {
		driver.manage().window().maximize();
	}
	
	public static void Minimize() {
		driver.manage().window().minimize();
	}
	
	public static void implicityWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void ClickOnElement(WebElement element) {
		element.click();
	}
	
	public static void SendKeysOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void GetTitle() {
		driver.getTitle();
	}
	
	public static void CloseWindow () {
		driver.close();
	}
	
	public static void QuitWindow() {
		driver.quit();
	}
	
	public static void NavigateUrl(String Url) {
		driver.navigate().to(Url);
	}
	
	public static void NavigateForword() {
		driver.navigate().forward();
	}
	
	public static void NavigateBack() {
		driver.navigate().back();
	}
	
	public static void NavigateRefresh() {
		driver.navigate().refresh();
	}
	
	public static void FrameId(WebElement Id) {
		driver.switchTo().frame(Id);
	}
	
	public static void FrameName(WebElement Name) {
		driver.switchTo().frame(Name);
	}
	
	public static void FrameIndex(WebElement Index) {
		driver.switchTo().frame(Index);
	}
	
	public static void FrameWebElement( WebElement Element) {
		driver.switchTo().frame(Element);
	}
	
	public static void MainFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void AcceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}	
		
	public static void DismissAlert( ) {
		Alert alert = driver.switchTo().alert();	
		alert.dismiss();
	}
	
	public static void SendKeyAlert(String Value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Value);
	}
	
	public static String GettextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public static void DropdownValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void DropdownIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void DropdownVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText("visibletext");
	}
	
	public static void DropdownDeslectValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue("value");
	}
	
	public static void DropdownDeselectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	public static void DropdownDeselectVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.deselectByVisibleText("visibletext");
	}
	
	public static void DropdownMultiple(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
	}	
		
	public static void DropdownSelectAllOption(WebElement element) {
		Select select = new Select(element);	
		select.getAllSelectedOptions();
	}
		
	public static void DropdownGetOption(WebElement element) {
		Select select = new Select(element);
		select.getOptions();
	}
	
	public static void DropdownGetFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}
	
	public static void JsExcecutorClick (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click();", element);
	}
	
	
	public static void JsExecutorScrollIntoView (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void JsExecutorScrollBy (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
	}
	
	public static void mouseActionClick (WebElement element) {
		Actions act = new Actions (driver);
		act.click(element).build().perform();
	}
	
	public static void mouseActionContextClick (WebElement element) {
		Actions act = new Actions (driver);
		act.click(element).build().perform();
	}
	
	public static void mouseActionDoubleClick (WebElement element) {
		Actions act = new Actions (driver);
		act.click(element).build().perform();
	}
	
	public static void mouseActionMoveToElement (WebElement element) {
		Actions act = new Actions (driver);
		act.click(element).build().perform();
	}
	
	public static void mouseActionDropAndDown (WebElement element) {
		Actions act = new Actions (driver);
		act.click(element).build().perform();
	}
	
	public static void keyboardActionPress (WebElement element) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void keyboardActionRelease (WebElement element) throws Throwable {
		Robot r = new Robot();
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void windowHandle (WebElement element) {
		String id = driver.getWindowHandle();
	}
	
	public static void windowHandles (WebElement element) {
		Set<String> ids = driver.getWindowHandles();
	}
	
	public static void switchToWindow (String element) {
		driver.switchTo().window(element);
	}
	
	
	
}





























