package com.class20;

public class reversed {

//	        Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
//			Create a method that will take a String and return whether String is palindrome or not. Method should be available to all classes within your projects.
//			Create a method that will take a string and return an array of words from that string. Method should be available only within same class.

	 String reverse(String word) {

		String result = "";

		char[] myCharArray = word.toCharArray();

		for (int i = myCharArray.length - 1; i >= 0; i--) {

			result = result + myCharArray[i];

		}
		return result;
	}
	 
	 public boolean palindrom(String pali) {
		 
		 boolean flag=false;
		 
		 String reverse = reverse (pali);
		 
		 if (reverse.equals(pali))
			 
			 flag=true;
		 else {
			 flag=false;
		 }
		 
		 return flag;
	 }

}

/*
 * String reverseString(String param) { String result = "";
 * 
 * char[] charArray = param.toCharArray();
 * 
 * for (int i = charArray.length - 1; i >= 0; i--) { result += charArray[i]; }
 * 
 * return result;
 */
