package com.class9;

public class introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for loop--> you know the number; while / do while when we dont know how many
		 * times we want to repeat block for code.
		 * 
		 * for loop syntax.
		 * 
		 * Nested loops for (int i=1, i<=3; i++){
		 * system..out,println("I am outer theloop") for (int j=1; j<=3, j++){
		 * 
		 * } }
		 */

		for (int i = 1; i <= 3; i++) {
			System.out.println("I am outer theloop");
			for (int j = 1; j <= 3; j++) {
				System.out.println("i am ineer the loop");
			}
		}
		System.out.println("******************************************************");
	}

}
