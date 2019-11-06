package com.class4;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rate=2.5;
		int houseValue=200001;
		
		if (rate>=4.5) {
			
			System.out.println("I cant buy the house");
		} else {
			
			System.out.println("Yes i can buy the house");
			
			if (houseValue>=200000) {
				
				System.out.println("Please take aloan");
			} else {
				
				System.out.println("I will pay cash");
			}
		}
		
	}

}
