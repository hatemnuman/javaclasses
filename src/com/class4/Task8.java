package com.class4;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your number");
		
		int num=scan.nextInt();
		
		if (num<100) {
			if (num>=10) {
				System.out.println("your number is two digits");
			}} else if (num<1000) {
				if(num>=100) {
					System.out.println("Your Number is three Digits");
				} }else if (num<10000) {
					if(num>=1000) {
						System.out.println("your number is Four Digits");
					}
				}
		
	}}
			
		
		
			
