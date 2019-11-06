package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 999;

		if (num > 1 && num < 10) {

			System.out.println("your number is small");

		} else if (num >= 10 && num < 100) {

			System.out.println("your number is small");

		}else if (num>=100 && num<1000) {
			System.out.println("You number is large");
		}
	}
}