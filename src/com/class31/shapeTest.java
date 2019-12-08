package com.class31;

public class shapeTest {

	public static void main(String[] args) {
		
		Shape obj=new Circle(12);
		double sumA= obj.calculateArea();
		System.out.println(sumA);
		double sumP=obj.calculatePerimiter();
		System.out.println(sumP);
		
		Shape obj2=new Square(5);
		double sumAA=obj2.calculateArea();
		System.out.println(sumAA);
		double sumPP=obj2.calculatePerimiter();
		System.out.println(sumPP);
		
		
	}

}
