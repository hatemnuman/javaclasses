package com.class4;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if statment inside another if statement if (boolean experession){
		 * 
		 * System.out.println("Hello") if (boolean expession){
		 * system.out.println("Hello my friend")
		 * 
		 * } }
		 */

		boolean b = true;
		boolean classToday = true;

		if (b) {

			System.out.println("Hello");

			if (classToday) {
				System.out.println("Hello my firend");
			}
		} else {
			System.out.println("Bye");
		}
		

	}
	
	

}
