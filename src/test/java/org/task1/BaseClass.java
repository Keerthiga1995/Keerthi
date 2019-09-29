package org.task1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
static WebDriver driver;
public static void acc() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\TaskOfTestng\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
}
public static void getUrl(String url) {
	driver.get(url);
	
}
public static void write(WebElement element,String str) {
	element.sendKeys(str);
}
public static void btnclick(WebElement log) {
	log.click();
}
public static void subbt(WebElement log) {
	log.click();
}
}
