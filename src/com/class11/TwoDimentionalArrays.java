package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare2D Array
		int[][] array = new int[3][5];

		// 1st row

		array[0][0] = 44;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;

		// 2nd row

		array[1][0] = 55;
		array[1][1] = 66;
		array[1][2] = 77;
		array[1][3] = 88;

		// 3rd row

		array[2][0] = 10;
		array[2][1] = 20;
		array[2][2] = 30;
		array[2][3] = 50;

		System.out.println(array[0][0]);

		// Tskk 2 and 3

		int[][] task = new int[2][3];

		task[0][0] = 10;
		task[0][1] = 20;
		task[0][2] = 30;
		task[1][3] = 50;
		task[1][0] = 10;
		task[1][1] = 20;
		task[2][2] = 30;
		task[2][3] = 50;
		task[2][0] = 10;
		task[3][1] = 20;
		task[3][2] = 30;
		task[3][3] = 50;

		System.out.println(task[1][1]);

		int[][] numbers = { { 1, 2, 5, 4, 5 }, { 1, 2, 5, 4, 7 }, { 1, 5, 4, 8, 8 },

		};
		
		//System.out.println(numbers[1][4]);
		
		//numbers of Rows
		System.out.println(numbers.length);
		
		//To identify the numbers Colums/elements in aow
		System.out.println(numbers[0].length);

	}

}
