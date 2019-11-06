package com.class9;

public class Nestedloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 6; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a <= 9; a++) {
				System.out.print(a);

			}
			System.out.println();
		}
		
		for (int a=5; a>=1; a--) {
			for (int i=5;i>=1; i--) {
				System.out.print(i);
			}System.out.println();
		}
	}
}
