package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades. Then you program should print name of the students that has
		 * as an A and B grade
		 */

		String[][] names = { { "Hatem", "Numan", "Moe", "Hawa" }, 
				             { "A", "B", "C", "D" }

		};
		
		for (int i=0; i<=names.length-1;i++) {
			for (int j = 0; j < names.length+1; j++) {
				if (names[i][j].equals("A")) {
					System.out.println("Your name is "+names[0][0]+" and your grade is "+names[i][j] );
				}else if (names[i][j].equals("B")) {
					System.out.println("Your name is "+names[0][1]+" and your grade is "+ names[i][j] );
				}
			}
		}

	}

}
