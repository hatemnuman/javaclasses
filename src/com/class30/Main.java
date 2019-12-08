package com.class30;

public class Main implements MyInterface {

	public static void main(String[] args) {
		MyInterface obj=new Main();
		obj.myFirstMethod();
		obj.mySecondMethod();

	}

	public void myFirstMethod() {
		System.out.println("implementation of method1");

	}

	public void mySecondMethod() {
		System.out.println("implementation of method2");

	}

}
