package com.class10;

import java.util.Scanner;

public class Traning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("Please enter you array number");
		int myArray = scan.nextInt();
		int array[] = new int[myArray];

		for (int i = 0; i <= array.length-1; i++) {
			System.out.println("Please enter your digit number " + (i + 1));
			array[i] = scan.nextInt();
		}
		for (int i = 0; i <= array.length-1; i++) {
			sum = sum + array[i];

		}
		System.out.print("The sum of your numbers = "+sum);

	}

}
