package com.class18;

public class Task1 {
	
	public static void main(String[] args) {
		
		Task1 numm=new Task1();
		
		numm.compare(10, 20);
	}
	
	void compare(int num1, int num2) {
		
		if (num1>num2) {
			
			System.out.println(num1+ "is grater than "+ num1 );
		}else {
			System.out.println(num2+ " is grater than "+ num2);
		}
		
	}
	

}
