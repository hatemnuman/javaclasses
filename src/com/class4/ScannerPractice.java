package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner KeyBoard=new Scanner(System.in);
		
		System.out.println("Please Enter you first number");
		
		int num1=KeyBoard.nextInt();
		
		System.out.println("Please Enter scond number");
		
		int num2=KeyBoard.nextInt();
		
		if(num1>num2)
		
		{System.out.println(num1+ " Is larger that "+ num2);
			
		}else{
			
			System.out.println("not correct");
		}
		

	}

}
