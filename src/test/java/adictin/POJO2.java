package adictin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POJO2 extends BaseClass{
	public POJO2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="hotels")
	private WebElement hotels;
		
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adultrm;
	
	@FindBy(id="child_room")
	private WebElement childrm;
	
	@FindBy(id="Submit")
	private WebElement sub;

	public WebElement getSub() {
		return sub;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultrm() {
		return adultrm;
	}

	public WebElement getChildrm() {
		return childrm;
	}	
	}

	
