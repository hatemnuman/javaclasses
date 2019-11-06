package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (true) {

		System.out.println("PLease Enter your user Name");
		String user = scan.nextLine();
		System.out.println("please Enter your Password");
		String pass = scan.nextLine();
		System.out.println("Please confirm your Password");
		String pass1 = scan.nextLine();
		

			if (user.isEmpty() || pass.isEmpty()) {
				System.out.println("User Name and Password cannot be empty");
				continue;
			} 

			if (pass.length() < 8) {
				System.out.println("your password is too short");
				continue;
			}
			if (user.contains(pass)) {
				System.out.println("Password cannot contain user name");
				continue;
			}
			System.out.println("User Name and Passowrd has been created");
			break;
		
		}
		scan.close();

	}

}