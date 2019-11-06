package com.class10;

import java.util.Scanner;

public class Assi78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]);

		}

	}

}