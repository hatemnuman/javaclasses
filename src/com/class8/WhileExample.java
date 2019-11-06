package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner scan;
		boolean isRain;
		scan=new Scanner (System.in);
		do {
			System.out.println("Is it Raining");
			isRain=scan.nextBoolean();
		}while (isRain);
		System.out.println("Go to the Park");		

	}

}
