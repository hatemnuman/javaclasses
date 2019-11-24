package com.class23;

public class Constructor1 {
	
	public String firstName;
	public String lastName;
	public int age;
	
	public Constructor1() {
		
		System.out.println("My First Name is "+firstName+" My Last Name is "+lastName+" and my age is "+age);
		
		
	}
	
	
	public Constructor1(String name, String familyname, int myAge) {
		firstName=name;
		lastName= familyname;
		age=myAge;
		
	}
	
	public void info() {
		
		System.out.println("My First Name is "+firstName+" My Last Name is "+lastName+" and my age is "+age);
		
	}
	
	

}
