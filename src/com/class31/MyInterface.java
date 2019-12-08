package com.class31;

public interface MyInterface {
	
	int a=100;
	final int b=200;
	static int c=300;
	
	public void displayInfo();

}

class Main implements MyInterface{
	
	Main(int a, int b, int c){
		
	}
	
	public void displayInfo() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}