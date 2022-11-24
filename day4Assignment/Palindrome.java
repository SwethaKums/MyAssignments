package week1.day4Assignment;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		String rev="";
		char[] array=name.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
		  rev=rev+array[i];
	      }
		System.out.println(rev);
		if(name.equals(rev)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
}}