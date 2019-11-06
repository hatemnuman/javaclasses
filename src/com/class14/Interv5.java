package com.class14;

import java.util.Scanner;

public class Interv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5.Write a java program to reverse String? Reverse a string word by word?
				
		
		String reverseString = "";


		String str = " hatem mahmoud numan";
		char[] name = str.toCharArray();

		for (int j = name.length-1 ; j >0; j--) {

			reverseString = reverseString + name[j];

		}			

		System.out.println(reverseString);
		
		String str1="We have Java class on Saturdays and Sundays";
        String[] arr=str1.split(" ");
        for (int i = 0; i < arr.length; i++) {
        }
        for (int i = arr.length-1;i>=0; i--) {
        System.out.print(arr[i]+" ");
  }
	}

}
