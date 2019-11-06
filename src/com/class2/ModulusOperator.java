package com.class2;

public class ModulusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		
		System.out.println(div);
		
		int number1=13;
		int number2=2;
		int divOfInteger=number1/number2;
		
		System.out.println(divOfInteger);
		
		double d=12;
		System.out.println(d);
		
		//int i=12.5; cannt covert from double
		
		//modulus gives remaning of division
		
		int a=15;
		int b=9;
		
		int remainder=a%b;
		System.out.println(remainder);
		
		
		//any arithmetic operation in Java will follow precedence rule
		//parentesis, division/ 
		
		int myNumber=8+8*2;
		System.out.println(myNumber);
		
	}

}
