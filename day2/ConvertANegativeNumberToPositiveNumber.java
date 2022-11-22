package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number=-40;
		if(number<0) {
			int value=Math.absExact(number);
			System.out.println(value);
		}
	}

}
