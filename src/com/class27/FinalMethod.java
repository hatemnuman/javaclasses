package com.class27;

import java.util.Scanner;

public class FinalMethod {
	
//	For you to do
//
//		Create a final method and name it reverseString with a return type of String. when you call the method and enter the string parameter, the method should return my string. implement a scanner class to reverse the string.
//
//		Input:
//		 hello
//
//		Output:
//		olleh
	
	//Scanner scan=new Scanner(System.in);
	
	public final String reverseString(String str) {
		
		String myWord=str;
		String reversed="";
		
		for (int i=myWord.length()-1; i>=0;i--) {
			
			reversed=reversed+myWord.charAt(i);
		}
		
		
		
		return reversed;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		FinalMethod obj=new FinalMethod();
		String reve=obj.reverseString("Hello");
		
		System.out.println(reve);
	}
		
	}


