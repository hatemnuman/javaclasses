package com.class3;

public class ifcondiotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int expetedHouers=15;
		int actualHours=2;
	
		if(actualHours>expetedHouers) {
			
			System.out.println("you will succeed");
			
			
		}
		else {
			
			System.out.println("you will fail");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		
		
		//teaPrice-=2;
		
		if (allowedPrice<=teaPrice) {
			
			System.out.println("Drink coffee");
			System.out.println("And i will enjoy my tea ");
		}else {
			
			System.out.println("dont buy");
			System.out.println("next time");
		}
		
		System.out.println("i will bye more");

	}

}
