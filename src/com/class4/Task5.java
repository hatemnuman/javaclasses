package com.class4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner age=new Scanner(System.in);
		
		System.out.println("How old are you");
		
		int num1=age.nextInt();
		
		if (num1>=18) {
			
			System.out.println("DMV will issue your Drive Liecense");
		}else {
			System.out.println("DMV wil not issue your Drive Licence");
		}

	}

}
