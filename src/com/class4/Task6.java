package com.class4;

import java.util.Scanner; 
public class Task6 {

	public static void main(String[] args, Object scan) {
		// TODO Auto-generated method stub
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("PLease enter the Temperature");
		
		//String month=scan.next()
		
		int temp=scan1.nextInt();
		
		
		System.out.println("Please enter name of the city");
	
		String cityName=scan1.nextLine();
		
		
		int covertedTep=(temp-32)*5/9;
		 
		System.out.println("The covertedTep is= "+ covertedTep);
		
		
		
		


	}

}
