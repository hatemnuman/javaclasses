package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 * *****************************************************************************
		 * *** Create a 2D array of integer type with 3 rows and 4 columns and print all
		 * values of the whole array.
		 */

		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 8, 7, 6 }, };

		/*for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j] + " ");
				}
			}

		}System.out.println();
		System.out.println("***************************************");*/
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <= numbers.length; j++) {
				System.out.print(numbers[i][j]+" ");
				
			}//System.out.println();
		}System.out.println();
		for (int myNumber[]:numbers) {
			for (int getNumber:myNumber) {
				
				System.out.print(getNumber+" ");
				
			}
		}
	}
}
