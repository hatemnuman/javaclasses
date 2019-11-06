package com.class4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sacn=new Scanner(System.in);
		
		System.out.println("Please enter the current tempreture");
		
		int Temp=sacn.nextInt();
		
		System.out.println("Pleas enter the City Name");
		
		String cityName=sacn.next();
		//boolean myInput=sacn.hasNext()
		
		int ConvertedTemp=(Temp-32)*5/9;
		
		System.out.println("The Temprature in the City of "+ cityName+ " is "+ ConvertedTemp);
		
		
		

	}

}
