package adictin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO4 extends BaseClass {
	public POJO4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement ba;
	
	@FindBy(id="cc_num")
	private WebElement creditnum;
	
	public WebElement getFn() {
		return fn;
	}



	public WebElement getLn() {
		return ln;
	}

	public WebElement getBa() {
		return ba;
	}
	public WebElement getCreditnum() {
		return creditnum;
	}
	public WebElement getCredittype() {
		return credittype;
	}
	public WebElement getExmon() {
		return exmon;
	}
	public WebElement getExyr() {
		return exyr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id="cc_type")
	private WebElement credittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement exmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement exyr;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
}
