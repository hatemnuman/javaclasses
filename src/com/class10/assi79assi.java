package com.class10;

import java.util.Scanner;

public class assi79assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

			
			int[] myArray = new int[11];

			for (int i = 0; i < myArray.length; i++) {
				System.out.println("Please enter your years");
				myArray[i] = scan.nextInt();
			}
			for (int i = 0; i < myArray.length; i++) {
				System.out.println(myArray[i]);
			}

		}

	}