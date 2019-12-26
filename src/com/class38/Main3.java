package com.class38;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		 comparingNumber(9);
		 } catch (RuntimeException e) {
			 
			 System.out.println(e.getMessage());
		 }	
		

	}
	
	public static void comparingNumber(int num) {
		
		if (num >10) {
			System.out.println("Number is greater that 10");
		}else {
			throw new RuntimeException ("Number is less than 10");
		}
	}

}
