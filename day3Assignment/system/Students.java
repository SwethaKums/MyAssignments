package week2.day3Assignment.system;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id is "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("studentid is "+id+" "+"studentname " +name);
	}
	public void getStudentInfo(String email,long number) {
		System.out.println("mailid is " +email+" "+"number is "+number);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(90);
		obj.getStudentInfo(90, "swetha");
		obj.getStudentInfo("swethalog32@gmail.com", 78997643589L);
	}

}
