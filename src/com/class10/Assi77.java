package com.class10;

import java.util.Scanner;

public class Assi77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] day = new String[7];

		for (int i = 0; i < day.length; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");
			day[i] = scan.nextLine();

		}
		for (int i = 0; i <= day.length-1; i++) {
			System.out.println(day[i]);
		}

	}

}
