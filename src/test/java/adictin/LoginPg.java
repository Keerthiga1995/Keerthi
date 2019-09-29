
package adictin;

public class LoginPg extends BaseClass{
public static void main(String[] args) {
	acc();
	getUrl("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	POJO1 p=new POJO1();
	write(p.getUsername(),"Keerthiga");
	write(p.getPassword(),"Keethu@1995");
	btnclick(p.getLogin());
}
}