package com.class17;

public class Main1 {
	
	//Assignment 106
	
	String name, color; 
	int modelYear;
	
	public static void main(String[] args) {
		
		Main1 car1=new Main1();
		car1.color="Black";
		car1.modelYear=2019;
		car1.name="BMW";
		
		Main1 car2=new Main1();
		car2.color="White";
		car2.modelYear=2018;
		car2.name="Toyota";
		
		System.out.println("Car color is "+ car1.color+" and car model year is " +car1.modelYear+" and car name is " +car1.name);
		System.out.println("Car color is "+car2.color+ " and car model year is "+car2.modelYear+ " and car name is "+car2.name);
		

	}

}
