package com.class38;

public class Main2 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30 };
		
		try {System.out.println(array[4]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}