package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 * 
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades. Then you program should print name of the students that has
		 * as an A and B grade
		 */

		String[][] name = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" },

		};

		for (int i = 0; i <= name.length-1; i++) {
			for (int j = 0; j <= name.length+1; j++) {

				if (name[i][j].equals("Mrs")) {
					System.out.println(name[i][j] + " Smith");
				} else if (name[i][j].equals("Mr")) {
					System.out.println(name[i][j] + " Obama");
				} else if (name[i][j].equals("Ms")) {
					System.out.println(name[i][j] + " Jackson");
				} else if (name[i][j].equals("Miss")) {
					System.out.println(name[i][j] + " jordan");

				}

			}
		}

	}
}

/*
 * for (String[] newName:name) { for (String realName:newName) {
 * System.out.print(realName); System.out.println(realName+1); }
 * 
 * }
 */
