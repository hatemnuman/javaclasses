package com.class14;

public class Practice {

	public static void main(String[] args) {
		
		String a="hello";
		String b="world";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a was hello and now "+a);
		System.out.println("b was world and now "+b);
		

		

	}
}