package com.class1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main obj = new Main();
		obj.myMethod();
	}

	public final void myMethod() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first number ");
		int a = scan.nextInt();
		// System.out.println("The value of a=" + a);
		System.out.println("Please enter your second number ");
		int b = scan.nextInt();
		// System.out.println("The value of b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a is now assigned value of" + a);
		System.out.println("b is now assigned value of" + b);

	}

}
