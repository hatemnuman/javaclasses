package com.class24;

import java.security.acl.LastOwnerException;

public class Task {
	
	String firstName;
	String lastName;
	int age;
	
	public Task(String fName ,String lName) {
		
		firstName=fName;
		lastName=lName;
	}
	
	private Task (String fName) {
		
		firstName=fName;
		
		
	}
	
	public void displayInfo() {
		
		System.out.println(firstName+ " "+lastName);
		
	}
	
	Task(String fName, String lName, int myAge){
		
		firstName=fName;
		lastName=lName;
		age=myAge;
	}
	
	
	


}
