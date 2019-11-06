package com.class6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String gender;
		int age;
		
		System.out.println("PLease Enter your gender");
		gender=scan.nextLine();
		System.out.println("Please enter your age");
		age=scan.nextInt();
		if (age >25 && gender.equals("M")) {
			System.out.println("Male");
		} if (age >25 && gender.equals("F")) {
			System.out.println("woman");
		}else if (age <25 && gender.equals("M")) {
			System.out.println("Boy");
		}if (age <25 && gender.equals("F")) {
			System.out.println("Girl");
		}

	}

}
