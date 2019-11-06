package com.class4;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc=scan.nextBoolean();
		
		
		if (cc) {
			System.out.println("What is yout balance on your credit");
			
			int balance=scan.nextInt();
			
			if (balance>1000) {
				
				System.out.println("please pay your balance");
			}else {
				
				System.out.println("You can spend more money");
			}
			
		}else {
			System.out.println("Would you like to apply for one");
		}

	}

}
