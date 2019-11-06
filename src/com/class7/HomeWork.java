package com.class7;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal=5;
		 * After user paid then say "Enjoy your coffer"
		 */
		Scanner scan=new Scanner(System.in);
		int pay=0;
		do {
			System.out.println("Please pay for you Coffee");
			pay=scan.nextInt();
		}while (pay!=5);
		System.out.println("Enjoy you Coffee");	
	}

}
