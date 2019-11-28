package com.class25;

public class Addition {
	
	//method over Loading
	//1 by passing different amount of  parameters
	//
	
	public void add(int num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	
	public void add(int num1, int num2, int num3) {
		
		System.out.println(num1+num2+num3);
		
		System.out.println();
		
	}
	
	//2 by having differnt types parameters;
	
	public void add(double num1, double num2) {
		
		System.out.println(num1+num2);
		
	}
	
	public static void main(String[] args) {
		
		Addition obj=new Addition();
		obj.add(2.0, 3.0);
		obj.add(2,3);
		obj.add(1,2, 3);
	
		
	}

}
