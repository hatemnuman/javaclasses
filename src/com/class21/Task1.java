package com.class21;

public class Task1 {
	
//	Elion Limanaj (Instructor) 12:10 PM
//	1. CreateaClasscalled Employee:
//	● Create three variables eID , salary
//	and set the CEO to “Sumair”
//	● Create two objects of the class
//	Employee
//	● Set the value of eID, salary for each of
//	the objects
//	● Print out the eID , salary and CEO for
//	each of the objects
	
	String eID;
	int salary;
	public static String CEO;
	
	void printInfo() {
		
		System.out.println("eID number is "+eID+ " his salar is "+salary+ " and name of the CEO is "+ CEO);
		
		
	}
		
	
	public static void main(String[] args) {
		
		Task1.CEO="Samir";

		Task1 emp1=new Task1();
		emp1.eID="123";
		emp1.salary=500;
		
		emp1.printInfo();
		
		
		
		Task1 emp2=new Task1();
		emp2.eID="2244";
		emp2.salary=700;
		emp2.printInfo();
		
	}
	
	

}
