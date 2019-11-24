package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to create object syntax is className 
		
		car car1=new car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.widows=4;
		
		//accessing behavior for the first object
		car1.drive();// calling methed
		car1.start();
		car1.accelerate();
	
		
		car car2=new car();
		
		car2.make="BMW";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.widows=6;
		
		System.out.println("My car is BMM and Purplue "+car2.make+" "+car2.color);

	}

}
