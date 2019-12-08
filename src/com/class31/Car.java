package com.class31;

public class Car {
	
	 double carPrice;
	 String color; 
	 
	 public  double calculateSalePrice() {
		return carPrice;
		 
	 }

}

class Sadan extends Car{
	
	double length;
	
	public double calculateSalePrice() {
		
		if (length>20) {
			carPrice=carPrice-(carPrice*0.10);
		}else {
			carPrice=carPrice-(carPrice*0.20);
		}
		return carPrice;
		
	}
	
	
}

class Truk extends Car{
	
	double weight; 
	
	public double calculateSalePrice() {
		
		if (weight>2000) {
			
			carPrice=carPrice-(carPrice*0.10);		
		}else {
			carPrice=carPrice-(carPrice*0.20);
		}
		return carPrice;
		
	}
	
	
	
}
