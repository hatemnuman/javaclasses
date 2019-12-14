package com.class32;

public class Mainnn {
	
	public static void main(String[] args) {
		Person obj=new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		obj.displayBirth();
		System.out.println(obj.getSsn());
	}

}
