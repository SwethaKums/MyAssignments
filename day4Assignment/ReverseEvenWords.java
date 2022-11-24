package week1.day4Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		//String val="";
		
		String[]array=test.split(" ");
		StringBuilder val=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				val.append(array[i]);
			}
			else {
				val.append(new StringBuilder(array[i]).reverse());
				val.append(" ");
			}
		}
		
		System.out.println(val.toString().trim());
			}


	}


