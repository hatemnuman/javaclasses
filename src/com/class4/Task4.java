package com.class4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner loan=new Scanner(System.in);
		
		System.out.println("What is a mount of loan you need");
		
		double num1=loan.nextDouble();	
		
		if (num1<200000) {
			System.out.println("your loan been approved");
		}else 
			System.out.println("Your loan has been rejected");


	}

}
