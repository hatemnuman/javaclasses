package com.class10;

import java.util.Scanner;

public class Assi79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter number of Arrays");
		int arrayNumber = scan.nextInt();
		int[] myArray = new int[arrayNumber];

		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Please enter your years");
			myArray[i] = scan.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}

}
