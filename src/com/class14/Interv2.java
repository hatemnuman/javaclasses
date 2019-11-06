package com.class14;

public class Interv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 */

		int[] num = { 10,2, 3, 4, 5, 6, 7, 8, 9 };
		int max = num[0];
		int small = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {

				max = num[i];
				
			} else if (num[i] < small) {
				small = num[i];

			}

		}
		System.out.println(max);
		System.out.println(small);
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);

	}

}
