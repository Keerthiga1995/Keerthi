package adictin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO3 extends BaseClass {
	public POJO3() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement contin;
	
	
	public WebElement getButton() {
		return button;
	}


	public WebElement getContin() {
		return contin;
	
	}
}
