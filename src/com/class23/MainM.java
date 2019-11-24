package com.class23;

public class MainM {
	
	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		Employee obj2=new Employee("Joe", "Smith", 12345 , "01/01/1970", 35000);
		
		obj1.printInfo();
		obj2.printInfo();
		
	}

}
