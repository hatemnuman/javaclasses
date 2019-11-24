package com.class22;

public class SuperCar {
	String make;
	String brand;
	int year;
	String manufacture;
	int axle;
	int tireNumber;
	
	public SuperCar(String carMake, String carBrand, int carYear, String carManufacture, int caraxel) {
		
		make=carMake;
		brand=carBrand;
		year=carYear;
		manufacture=carManufacture;
		axle=caraxel;
		
	}
	
	public void displayInfo() {
		
		System.out.println("My Car is "+make+"The Brand is "+brand+"the year is "+year+" the manufacture is"+manufacture+" the number of axel is"+axle+"and is has number  tire  "+ tireNumber);
	}
	
	
	

}
