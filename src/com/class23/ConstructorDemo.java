package com.class23;

public class ConstructorDemo {

	ConstructorDemo() {

		System.out.println("I am your Const");

	}

	ConstructorDemo(String str) {

		System.out.println("1 parameter" + str);
	}

	ConstructorDemo(int num) {

		System.out.println("My Number is" + num);
	}
	
	ConstructorDemo(int num, int num2) {

		System.out.println("My Numbers are " + num +"and"+num2);
	}
	
	

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an Object");
		obj.hello();
		ConstructorDemo obj2 = new ConstructorDemo("My Parameter");
		ConstructorDemo obj3 = new ConstructorDemo(123);
		ConstructorDemo obj4 = new ConstructorDemo(123,321);

	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}

	public void hello(String hello) {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}

}
