package com.class17;

public class Main2 {
	
	//Assignment 107

	// a template for the DogClass.

	String breed, name, color;

	void bark() {
		
		System.out.println(breed+" can bark");
		

	}

	void run() {
		System.out.println(breed+ " can run");
		

	}

	void play() {
		
		System.out.println(breed+ " can play");

	}

	//Husky, Bulldog, Labrador 
	
	public static void main(String[] args) {
		
		Main2 Husky=new Main2();
		Husky.breed="Husky";
		
		Husky.bark();
		Husky.run();
		Husky.play();
		
		Main2 Bulldog=new Main2();
		Bulldog.breed="Bulldog";
		
		Bulldog.bark();
		Bulldog.run();
		Bulldog.play();
		
		Main2 Labrador=new Main2();
		Labrador.breed="Labrador";
		
		Labrador.bark();
		Labrador.run();
		Labrador.play();
		
		

		
	}

}
