package com.class14;

public class Practice {

	public static void main(String[] args) {

		String str = " Hatem Mahmoud Ismail Numan";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+" ");
		}
		
		System.out.println();
		
		for (int  j=str1.length-1;  j>0 ; j--) {
			
			System.out.print(str1[j]+" ");
			
		}
		

	}
}