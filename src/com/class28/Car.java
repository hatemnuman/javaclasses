package com.class28;

public class Car {
	
	String make, model;
	
	Car(){
		
		System.out.println("First Constroctor");
	}

}
class Tesla extends Car{
	
	boolean autopilot;
	
}
