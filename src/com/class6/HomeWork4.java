package com.class6;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char grade;
		String result="";
		System.out.println("Please Enter your grade");
		grade=scan.next().charAt(0);
		
		switch (grade) {
		case 'A':
		result= "Excelent";
			break;
		case 'B':
			result= "Good";
			break;
		case 'C':
			result= "Average";
			break;
		case 'D':
			result= "Bad";
			break;
			default:
				result="Not Acceptable";
				break;
			
		}System.out.println(result+ " Your grade is "+ grade);

	}

}
