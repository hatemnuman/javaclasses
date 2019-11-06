package com.class6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int salary, price;
		String carType="";
		
		
		System.out.println("Please enter your Salary");
		
		salary=scan.nextInt();
		if(salary>=50000) {
			System.out.println("you can buy a new car");
			System.out.println("PLease enter your price range");
			price=scan.nextInt();
			if (price<70000) {
				carType="Audi A5";
				if (price>=70000 && price<80000) {
					carType="Mercedes-Benz";
					if (price>=80000 && price<90000) {
						carType="Jaguar";
						if (price>90000 && price<100000) {
							carType="Tesla";
						}System.out.println("carType");
						
					}
				}
					
			}
		}else if (salary<50000) {
			System.out.println("Save up money and wait until next year");
		}
		else {
			System.out.println("you should buy a used car");
		}

	}

}
