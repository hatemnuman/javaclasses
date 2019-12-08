package com.class30;

public class Mainnn implements FirstInterface, SecondInterface{
	
	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
		
	}
	
	
	@Override
	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
		
	}
	
	public static void main(String[] args) {
		Mainnn obj=new Mainnn();
		obj.firstMethod();
		obj.secondMethod();
		
	}


}
