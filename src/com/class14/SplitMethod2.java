package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * How to separat comma delimated string
		 */

		String str = "hatem numan, hatem numan, Hatem numan, hatem numan";

		String[] array = str.split(",");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i].trim());

		}
		System.out.println("***************************************");
		
		// how many time you want to split
		
		String str1="Welcom to Syntax Technologies ";
		String[] array1=str1.split(" ", 3);
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
			
		}

	}

}
