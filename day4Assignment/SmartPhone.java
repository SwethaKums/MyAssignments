package week2.day4Assignment;

public class SmartPhone  extends IPhone{

	public static void main(String[] args) {
		SmartPhone obj=new SmartPhone();
		obj.iphone();
		obj.iPhone1();
		obj.iPhone2();
		obj.nokiya();
		obj.samsung();
		obj.vivo();

	}

	public void iphone() {
		System.out.println("this is iphone1");
		
	}

	public void nokiya() {
		System.out.println("this is Nokiya");
		
	}

	public void vivo() {
		System.out.println("this is vivo");
		
	}

	@Override
	public void iPhone2() {
		System.out.println("this is iphone2");
		
	}

	public void samsung() {
		System.out.println("this is sumsung");
		
	}

}
