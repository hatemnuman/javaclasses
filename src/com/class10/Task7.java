package com.class10;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the array length");
		int length=scan.nextInt();
		String array[]=new String[length];
		int size=array.length;
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter day "+ i +" of the week");
			array[i] = scan.nextLine();
		}
		
		
		
	}

	}


//0 2 4 6 8 10