package com.class18;

public class Task2 {
	
	public static void main(String[] args) {
		
		Task2 nummm=new Task2();
		
		nummm.evenOdd(3);
	}
	
	
	void evenOdd(int num) {
		
		if (num%2==0) {
			
			System.out.println(num +" ie Even Number");
		}else {
			System.out.println(num +" is Odd Number");
		}
	}

}
