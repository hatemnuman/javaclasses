package com.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double number1, number2,number3;
		System.out.println("Please Enter Three Double Numbers");
		System.out.println("Please enter your first Double number");
		number1=scan.nextDouble();
		System.out.println("Please enter your Second Double number");
		number2=scan.nextDouble();
		System.out.println("Please enter your Third Double number");
		number3=scan.nextDouble();
		if (number1>number2 && number1>number3) {
			System.out.println("The Largest Double number you entered is number1: "+number1);
		}else if (number2>number3 && number2>number1) {
			System.out.println("The Largest Double number you entered is number2: "+number2);
		}else if (number3>number1 && number3>number2) {
			System.out.println("The Largest Double number you entered is number3: "+number3);
		}
		

	}

}
