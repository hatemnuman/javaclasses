package com.class37;

import com.class2.ArithemticOperation;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=0;
		
		System.out.println(a/b);
		
		System.out.println("Code after an exception");
		System.out.println("continues code");
		
		int [] array= {10,45,5};
		
		System.out.println(array[3]);
		
		ArithmeticException exception= new ArithmeticException();
		
		throw(exception);

	}

}
