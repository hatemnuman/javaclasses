package com.class6;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char operator;
		double number1, number2,sum = 0;
		System.out.println("please Enter two numbers");
		number1=scan.nextDouble();
		number2=scan.nextDouble();
		System.out.println("Please enter your Operator(+,-,/,*)");
		operator=scan.next().charAt(0);
		switch (operator) {
		case '+':
			sum = number1+number2;
			break;
		case '-':
			sum = number1-number2;
			break;
		case '/':
			sum = number1/number2;
			break;
		case '*':
			sum = number1*number2;
			break;
			default :
				System.out.println("Unvalid Operation");
				break;
		}System.out.println("Your Operator is "+operator+ " The Reult is "+ sum);
		

	}

}
