package com.class12;

import java.util.Scanner;

public class Assignemnt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while (true) {

		System.out.println("Please Enter your user Name");
		String user = scan.nextLine();
		System.out.println("PLease Enter your Password");
		String pass = scan.nextLine();
		
		if (user.isEmpty()|| pass.isEmpty() ) {
			
			System.out.println("User Name and Password can't be empty");
		}else if (pass.length()<8) {
			System.out.println("Password is short");
		}else if (pass.contains(user)) {
			System.out.println("Password connt contain user name word");
		}

		}
	}
}
