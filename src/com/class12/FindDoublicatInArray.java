package com.class12;

public class FindDoublicatInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2={2,5,4,7,5,2,4};
		for (int i = 0; i < array2.length; i++) {
			for (int j =i+1; j < array2.length; j++) {
				
				if (array2[i]==array2[j]) {
					
					System.out.println(array2[i]);
					
				}
				
			}
		}

	}

}
