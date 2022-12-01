package week2.day3Assignment.system;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposite override");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();

	}

}
