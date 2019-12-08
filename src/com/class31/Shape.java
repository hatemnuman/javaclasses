package com.class31;

public interface Shape {
	
	public double calculateArea();
	public double calculatePerimiter();
	

}

class Circle implements Shape {
	final double pi = 3.14;
	int radius;
	
	 Circle(int radius) {
		this.radius=radius;
		
	}

	@Override
	public double calculateArea(){
		return pi * radius * radius;
	}

	@Override
	public double  calculatePerimiter() {
		return 2 * pi * radius;
		
	}
	
}

class Square implements Shape{
	
	int side;
	
	Square (int side){
		this.side=side;
		
	}

	

	@Override
	public double calculateArea() {
		return side*side;
		
	}

	@Override
	public double  calculatePerimiter() {
		return 4*side;
		
	}
	
}
