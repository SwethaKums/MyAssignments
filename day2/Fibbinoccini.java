package week1.day2;

public class Fibbinoccini {

	public static void main(String[] args) {
	int firstnum=0;
	int secondnum=1;
	int sum=0;
	System.out.println(firstnum);
	System.out.println(secondnum);
	for(int i=0;i<9;i++) {
		sum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=sum;
		System.out.println(sum);
	}
	}

}
