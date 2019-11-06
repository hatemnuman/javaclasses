package com.class11;

public class TowDim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = { 
				{ 1, 2, 5, 4, 5 }, 
				{ 1, 2, 5, 4, 7 }, 
				{ 1, 5, 4, 8, 8 },

		};
		
		for (int i=0; i<numbers.length;i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
