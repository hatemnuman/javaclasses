package com.class36;

import java.util.*;

class Car {
	String make, model;
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
		
	}
	
	public void display(){
		System.out.println(make+ " "+ model );
	}
}

public class CarTest {
	
	//create a car class that will have variable, methods and constructor
	//cre

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer , Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMM", "X5"));
		mapCar.put(2, new Car("Tesla", "X5"));
		mapCar.put(3, new Car("Mazda", "X5"));
		mapCar.put(4, new Car("Honda", "X5"));
		mapCar.put(2, new Car("Toyota", "X5"));
		
		//display only value objects
		Collection <Car> coll=mapCar.values();
		for (Car c:coll) {
			System.out.println(c.make+"--"+c.model);
			c.display();
		}
		
		System.out.println(mapCar.size());
		//map key to its corres
		
		

	}

}
