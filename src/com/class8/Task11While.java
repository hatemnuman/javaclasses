package com.class8;

import java.util.Scanner;

public class Task11While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name="";
		int i=1;
		while (i<=3) {
			System.out.println("PLease enter your Name");
			name=scan.nextLine();
			System.out.println("Hello "+name);
			i++;
		}
		

	}

}
