package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int myNumber = 0;

		System.out.println("Guess The Secret Number between 1--20");
		
		do {
			myNumber=scan.nextInt();
			if (myNumber>9) {
				System.out.println("Your Number is too Large");
			}else if (myNumber<9){
				System.out.println("your number is too small");
			}
			
		}while (myNumber!=9);
		
		System.out.println("You won");

		}

}
