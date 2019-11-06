package com.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * swich case similer to if else
		 * Switch case improves redability and it is faster
		 * Switcg case is a value base, if else is a condition base
		 * Limitation of Switch
		 * 1- switch work only with byte, long, int, String
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("PLease Enter you Gender");
		
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch (gender) {
		case 'F':
			userGender="Femal";
			break;
		case 'M':
			userGender="Male";
			break;
			default :
				userGender="Unknown";
				
		}System.out.println("Your Gendar is "+ userGender);
		

	}

}
