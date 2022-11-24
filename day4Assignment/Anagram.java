package week1.day4Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="posts";
		int val=text1.length();
		int val2=text2.length();
		System.out.println(val);
		System.out.println(val2);
		if(val==val2) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			
		
		Arrays.sort(charArray);
        Arrays.sort(charArray2);
        boolean result=Arrays.equals(charArray,charArray2);
        
		if(result) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
}