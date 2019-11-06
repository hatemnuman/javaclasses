package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		String month="";
		String Season="";
		
		scan=new Scanner(System.in);
		
		System.out.println("Please Enter the month you were born");
		month=scan.nextLine();
		
		if (month.equals ("Jan")|| month.equals("Feb") || month.equals("Dec")) {
			
			Season= "Winter";
		}else if (month.equals("Mar") || month.equals("Apr") || month.equals("May")) {
			
			
		}else {
			System.out.println("UnKnown");
		}
		
		System.out.println("You were born in " +Season);
		

	}

}
