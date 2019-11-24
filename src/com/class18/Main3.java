package com.class18;

public class Main3 {
	
	public static void main(String[] args) {
		
		Main3 Math=new Main3();
		
		Math.addition(20, 10);
		Math.multiplication(3, 10);
		Math.subtraction(30, 10);
	}

	void addition(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);
	}

	void multiplication(int num1, int num2) {

		int sum = num1 * num2;
		System.out.println(sum);
	}

	void subtraction(int num1, int num2) {

		int sum = num1 - num2;
		System.out.println(sum);
	}

}
