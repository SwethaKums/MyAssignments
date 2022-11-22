package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n =13;
		boolean  value=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				value=false;
				break;
			}
		}
		System.out.println(value);

	}

}
