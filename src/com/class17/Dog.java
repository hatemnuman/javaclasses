package com.class17;

public class Dog {
	
	int age, tall, weight;
	String color, eye, type;
	
	void runFast() {
		
		System.out.println("My Dog type is "+type+"and he is runing so fast");
	}
	
	public static void main(String[] args) {
		
		Dog Husky=new Dog();
		Husky.type="Husky";
		Husky.color="white";
		Husky.eye="Black";
		Husky.age=3;
		Husky.tall=2;
		
		Husky.runFast();
		
		System.out.println("The type of my dog is "+ Husky.type+" and his color is "+Husky.color+" and his eye color is "+ Husky.eye);
		
		
	}
	

}

