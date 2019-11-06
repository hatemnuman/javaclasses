package com.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean sales=true;
		double price;
		double balance;
		double finalprice;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have sale");
		
		sales=scan.nextBoolean();
		
		if (sales) {
			
			System.out.println("PLease enter your price");
			
			price=scan.nextDouble();
			
			if (price<20) {
				balance=price*0.10;
				finalprice=price-balance;
				
				
			}else if (price>=20 && price<=100) {
				
				balance=price*0.20;
				finalprice=price-balance;
			}else if (price>=100 && price<=5000) {
				balance=price*0.30;
				finalprice=price-balance;
			}else {
				balance=price*.50;
				finalprice=price-balance;
			}
			System.out.println("After the discount "+balance + " the price of the item redce from "+ price +"to "+finalprice);
			
			
			
			
		}else System.out.println("IM not shoping");
		
		
		

	}

}
