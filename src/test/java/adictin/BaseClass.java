package adictin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver driver;
public static void acc() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenium1\\Test\\driv\\chromedriver.exe");
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
public static void locName(WebElement loc, String a) {
	Select s=new Select(loc);
	s.selectByValue(a);
}
public static void hotel(WebElement loc, String a) {
	Select s=new Select(loc);
	s.selectByValue(a);
}
public static void roomType(WebElement loc, String a) {
	Select s=new Select(loc);
	s.selectByValue(a);
}
public static void roomNo(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}
public static void inDate(WebElement element,String str) {
	element.sendKeys(str);
	}
public static void outDate(WebElement element,String str) {
	element.sendKeys(str);
}
public static void adult(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}
public static void children(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}

public static void butt(WebElement log) {
	log.click();
}

public static void con(WebElement log) {
	log.click();
}

public static void firstName(WebElement element,String str) {
	element.sendKeys(str);
}
public static void lastName(WebElement element,String str) {
	element.sendKeys(str);
}
public static void billAdd(WebElement element,String str) {
	element.sendKeys(str);
}
public static void credNum(WebElement element,String str) {
	element.sendKeys(str);
}
public static void credType(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}
public static void exMon(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}
public static void exYr(WebElement loc, int a) {
	Select s=new Select(loc);
	s.selectByIndex(a);
}
public static void cvv(WebElement element,String str) {
	element.sendKeys(str);
}
public static void book(WebElement log) {
	log.click();
}
public static void logout(WebElement log) {
	log.click();
}
}