package week1.day3Assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]array= {3,2,11,4,6,7};
      int[]arrayval= {1,2,8,4,9,7};
      for(int i=0;i<array.length;i++) {
    	  for(int j=0;j<arrayval.length;j++) {
    		  if(array[i]==arrayval[j]) {
    			  System.out.println("the common values are"+array[i]);
    		  }
    	  }
      }
	}

}
