package com.class19;

public class Task2 {

	boolean isPrime(int num) {

		boolean  prime= true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				prime = false;
				break;

			}

		}
		return prime;

	}

	public static void main(String[] args) {

		Task2 obj = new Task2();
		boolean p= obj.isPrime(20);
		System.out.println(p);

	}

}

//	Write a method to return whether
//	given number is prime or not? 
