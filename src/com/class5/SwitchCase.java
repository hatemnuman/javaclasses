package com.class5;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter Your age");
		int old=scan.nextInt();
		
		switch (old) {
		
		case  18 :
			System.out.println("You are adult");			
			break;
		
		}

	}

}
