package com.class23;

public class  Employee {
		
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Employee() {	
	}
	
	Employee(String nam1, String lastName1, int employeeId1,String startDate1, int salary1 ){
		
		name=nam1;
		lastName=lastName1;
		employeeId=employeeId1;
		startDate=startDate1;
		salary=salary1;		
	}
	
	public void printInfo() {
		
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	}

