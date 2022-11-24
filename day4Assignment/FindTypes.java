package week1.day4Assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ welcome to 2nd class of automation $$";
		int letter=0;
		int space=0;
		int num=0;
		int specialcharacter=0;
		char[]array=test.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(Character.isLetter(array[i])) {
				letter=letter+1;
			}
			else if(Character.isDigit(array[i])) {
				num=num+1;
			}
			else if(Character.isSpaceChar(array[i])) {
			 space=space+1;
			}
			else {
				specialcharacter++;
			}
	}
		System.out.println("Letters"+" "+ letter);
		System.out.println("Numbers"+" "+ num);
		System.out.println("spaces"+" "+ space);
		System.out.println("Specialcharacter"+" "+ specialcharacter);}

}
