package adictin;

public class SelectHotel extends BaseClass {
	public static void main(String[] args) {
	acc();
	getUrl("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
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

}
}