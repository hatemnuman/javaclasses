package com.class11;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] arr= { 2,5,3,5};
		// for (int ar:arr) {
		// System.out.println(ar);
		// }

		String[] cars = { "Toyota", "Mazda", "Nissan", "GMC", "Honda", "Mrcz" };

		for (String car : cars) {

			System.out.println(car);

		}
		System.out.println("*************************");

		int sum = 0;
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		for (int number : numbers) {

			sum = sum + number;

		}
		System.out.println(sum);

		System.out.println("************************");

		String[] country = { "USA", "Jordan", "Oman" };
		String[] capital = { "Washington", "Amman", "Omann" };

		for (String cout : country) {

			if(cout.equals("USA")) {
				System.out.println(capital[0]);
			}
		}

	

	}

}
