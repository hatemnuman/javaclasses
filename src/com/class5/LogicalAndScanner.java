package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		
		int age=scan.nextInt();
		
		if (age>=1 && age<=3) {
			
			System.out.println("You are a baby");
		}else if (age>3 && age<=5) {
			
			System.out.println("You are a toddler");
		}else if (age>5 && age<=12) {
			
			System.out.println("You are a kid");
		}else if (age>20) {
			
			System.out.println("YOu are adult");
		}

	}

}
