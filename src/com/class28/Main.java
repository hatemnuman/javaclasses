package com.class28;

public class Main extends Parent {

	public static void main(String[] args) {

		Parent parent = new Main();
		parent.m1();
		parent.m1("abstract method2 implementation with argument in main class");

	}

	String str;

	void m1() {
		System.out.println("abstract method1 implementation without argument in main class");

	}

	void m1(String str) {
		this.str = str;
		System.out.println(str);
	}

}
