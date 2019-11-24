package com.class23;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		Constructor1 obj1=new Constructor1();
		obj1. firstName="Hatem";
		obj1.lastName="Numan";
		obj1.age=40;
		
		
		
		Constructor1 obj2=new Constructor1("Hatem", "Numan", 40);
		
		obj2.info();
		
	
		
		
		
		
	}

}
