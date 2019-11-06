package com.class10;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create an array of countries. While retrieving all values from an array print capital for each country.
		 * 
		 */
		
		String[] country= {"Jordan", "Egypt", "Lebia"};
		
		for (int i=0; i<country.length; i++) {
			if (country[i].equals("Jordan")) {
				System.out.println("The capital is Amman");
			}else if (country[i].equals("Egypt")) {
				System.out.println("The capital is Qairo");
			}else if (country[i].equals("Lebia")) {
				System.out.println("The Capital is LEBIA");
			}
		}

	}

}


