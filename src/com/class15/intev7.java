package com.class15;

public class intev7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfor

		int num = 5;
		boolean isPrim = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				isPrim = false;

				break;

			}

		}

		if (isPrim) {
			System.out.println("Is Prime number");
		} else {
			System.out.println("Is not prome number");
		}
	}

}
