package adictin;

public class BookHotel extends BaseClass {
	public static void main(String[] args) {
		acc();
		getUrl("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		POJO4 p3=new POJO4();
		POJO3 p2=new POJO3();
		POJO2 p1=new POJO2();
		POJO1 p=new POJO1();
		write(p.getUsername(),"Keerthiga");
		write(p.getPassword(),"Keethu@1995");
		btnclick(p.getLogin());
		locName(p1.getLocation(),"Sydney");
		hotel(p1.getHotels(),"Hotel Sunshine");
		roomType(p1.getRoom(),"Standard");
		roomNo(p1.getRoomno(),2);
		inDate(p1.getDatein(),"20/10/2019");
		outDate(p1.getDateout(),"22/10/2019");
		adult(p1.getAdultrm(),3);
		children(p1.getChildrm(),2);
		subbt(p1.getSub());
		butt(p2.getButton());
		con(p2.getContin());
		firstName(p3.getFn(),"Keerthiga");
		lastName(p3.getLn(),"Sugumar");
		billAdd(p3.getBa(),"Chennai");
		credNum(p3.getCreditnum(),"7896541258457458");
		credType(p3.getCredittype(),3);
		exMon(p3.getExmon(),5);
		exYr(p3.getExyr(),9);
		cvv(p3.getCvv(),"324");
		book(p3.getBook());
}
}