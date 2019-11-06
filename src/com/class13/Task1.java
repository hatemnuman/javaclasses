package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your class day:: ");
		String day=scanner.nextLine();
		
		if (day.equals("Saturday")) {
			System.out.println("Saturday is your Java clas");
		}else if (day.equals("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if (day.equals("Tusday")) {
		System.out.println("Tusday is yourn SDLC class");
		}else if (day.equals("Thursday")) {
			System.out.println("Thursday is yourn SDLC class");
		}else {
			System.out.println("INVALID");
		}
		scanner.close();
	}
}

