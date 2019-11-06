package com.class12;

import java.util.Scanner;

public class Task2Scanner2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("PLease Enter your row number");
		int row=scan.nextInt();
		
		System.out.println("PLease Enter your column number");
		int column=scan.nextInt();
		
		int[][] numbers=new int [row][column];
		int max=numbers[0][0];
		int sum=0;
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column;j++ ) {
				System.out.println("enetr numebrs");
				numbers[i][j]=scan.nextInt();
				
				
				
				if (numbers[i][j]>max) {
					
					max=numbers[i][j];
					
				}
				
				
			}
			
		}for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]);
				
			}System.out.println();
			
			
		}
		System.out.println("The Highest Numbers is "+ max);
		

	}

}
