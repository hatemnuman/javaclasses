package com.class8;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum = 0, oddSum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else if (i % 2 == 1) {
				oddSum = oddSum + i;

			}

		}
		System.out.println("evenSum=" + evenSum);
		System.out.println("oddSum=" + oddSum);
	}

}
