package com.class30;

public interface Drivabel {

	// public static final variable

	boolean DRIVE_FAST = true;   //constant variables are written using upper case

	// by default compiler will add public abstract to the methods

	void drive();

}

class Car{
	public void stop() {
		System.out.println("Car stops by pressing braks");
	}
}

class Toyota implements Drivabel{

	@Override
	public void drive() {
		
		System.out.println("Toyota can drive");
	}
	
}

