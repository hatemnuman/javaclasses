package com.class14;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverseString = "";


		String str = " hatem mahmoud numan";
		char[] name = str.toCharArray();

		for (int j = name.length-1 ; j >0; j--) {

			reverseString = reverseString + name[j];

		}			

		System.out.println(reverseString);
	}

}
