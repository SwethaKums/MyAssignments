package week1.day4Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
		int count=0;
		char name='e';
	    char[]array=str.toCharArray();
		int length=array.length;
		System.out.println("the lenghth is"+length);
		for(int i=0;i<length;i++) {
			
			if(array[i]==name) {
				count=count+1;
				
			}
			
		}
		System.out.println("the count of e is"+count);
		
	}
	

}
