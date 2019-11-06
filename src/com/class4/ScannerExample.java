package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner is a class in Java that will allow us to take an input from a user 
		 * Scanner will help us to make our problem
		 */

		Scanner sacn=new Scanner(System.in);
		
		System.out.println("Please Enetr any number");
		
		/*
		 * nextInt();--->for numbers
		 * nextLine();--> String
		 * nextDouble();--> doubleHatem
		 */
		
		
		int number=sacn.nextInt();
		//double numberr=sacn.nextDouble()
		System.out.println("Entered number is"+ number);
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please Enter You Name");
		String name=input.nextLine();
		System.out.println("Goood Afternoon"+ name);
	}
	

}
