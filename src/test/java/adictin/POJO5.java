package adictin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO5 extends BaseClass{
	public POJO5() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement log;
	
	public WebElement getLog() {
		return log;
	}
}
