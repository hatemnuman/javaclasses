package com.class8;

import java.util.Scanner;

public class Tske8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String answer;
		
		for (int i=0; i<=10; i++) {
			System.out.println("Please apply for credit card");
			answer=scan.nextLine();
			if (answer.equals("yes")) {
				break;
			}
			
		}
		

	}

}
