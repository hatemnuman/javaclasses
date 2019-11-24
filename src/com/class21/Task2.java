package com.class21;

public class Task2 {
	
//	Elion Limanaj (Instructor) 12:41 PM
//	2. Create a Class called Students
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students
	
	
	String studentName;
	int studentId;
	static int numberOfStudent;
	
	void studentnumber() {
		
		System.out.println("The name od studnet is "+studentName+" and the studnet Id number is "+studentId+" also "
				+ "the number of the studnet is  "+numberOfStudent);
	}
	
	public static void main(String[] args) {
		
		Task2 stud1=new Task2();
		
		stud1.studentName="Hatem";
		stud1.studentId=123;
		Task2.numberOfStudent++;
		
		stud1.studentnumber();
		
		Task2 stud2=new Task2();
		stud2.studentName="Hawa";
		stud2.studentId=2244;
		Task2.numberOfStudent++;
		
		stud2.studentnumber();
		
		
		
	}
	
}
