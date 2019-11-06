package com.class12;

import java.util.Scanner;

public class Assi89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your row number");
		int row = scan.nextInt();
		System.out.println("PLease enter your colum number");
		int column = scan.nextInt();

		int[][] numbers = new int[row][column];
		int max = numbers[0][0];

		System.out.println("PLease enter you numbers");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				numbers[i][j] = scan.nextInt();
				if (numbers[i][j] > max) {
					max = numbers[i][j];

				}

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(numbers[i][j]);

			}
			System.out.println();
		}
		System.out.println(max);

	}

}