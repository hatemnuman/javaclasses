package com.class15;

public class intev8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Palindrome 3,5,7,11,...etc
		
		int num=10;
		boolean pali=true;
		
		for (int i=2;i<num; i++) {
			
			if (num%i==0) {
				
				pali=false;
				break;
			}
		}
		
		if (pali) {
			
			System.out.println("My Number is Palindrome");
		}else {
			
			System.out.println("My Number is not Palindrom");
		}
	}

}
