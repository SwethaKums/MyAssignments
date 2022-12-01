package week2.day3Assignment.student;

import week2.day3Assignment.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Swetha");
	}
	public void studentDept() {
		System.out.println("cse");
	}
	public void studentId() {
		System.out.println("95");
	}

 public static void main(String[]args) {
	 Student obj=new Student();
	 obj.collegeCode();
	 obj.collegeName();
	 obj.deptName();
	 obj.studentDept();
	 obj.studentId();
	 obj.studentName();
	 obj.collegeRank();
 }

}
