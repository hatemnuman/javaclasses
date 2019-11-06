package com.class14;

public class Interv6 {
	
	//6.Write a Java Program to find whether a String is palindrome or not?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Kayak";
		boolean flag = true;
		string = string.toLowerCase();
		for (int i = 0; i < string.length() / 2; i++);
		int i = 0;
		if (string.charAt(i) != string.charAt(string.length() - i - 1)) {

			flag = false;

		}

		if (flag)
			System.out.println("Given string is palindrome");
		else {
			System.out.println("Given string is not a palindrome");

		}
	}
}