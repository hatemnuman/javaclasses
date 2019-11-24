package com.class18;

public class Hello {
	
	void sayHello(String name) {
		
		System.out.println("Hello "+ name);
		
		
	}
	
	public static void main(String[] args) {
		
		Hello obj= new Hello();
		
		obj.sayHello("Hatem");
		obj.sayHello("Hawa");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Rassia");
		//obj.sayHelloDifferentLanguage(123); must be String
	}
	
	/*
	 * create method that will sau hello in diferent language based on the valsu that 
	 */

	void sayHelloDifferentLanguage(String country) {
		
		
	
	
	switch (country) {
	case "USA":
		System.out.println("Hello");
	break;
	case "Rassia":
		System.out.println("Privet");
		break;
	
	}
	}
}
