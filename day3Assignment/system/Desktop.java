package week2.day3Assignment.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("desktopsize");
	}
	public static void main(String[] args) {
		Desktop obj =new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
