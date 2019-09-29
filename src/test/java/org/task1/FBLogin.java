package org.task1;

public class FBLogin extends BaseClass{

public static void main(String[] args) {
	acc();
	getUrl("https://www.facebook.com/");
	driver.manage().window().maximize();
	POJO1 p=new POJO1();
	write(p.getUsername(),"Keerthiga");
	write(p.getPassword(),"Keethu@1995");
	btnclick(p.getLogin());
}
}
