package com.class10;

import java.util.Scanner;

public class assi80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i <= num.length-1; i++) {
			num[i] = scan.nextInt();

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]*10);
		}

	}

}
