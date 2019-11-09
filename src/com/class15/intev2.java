package com.class15;

import java.util.Arrays;

public class intev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10,20,100,200,-10,0,1};
		
		//easy way
		
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		
		System.out.println("***************************************");
		
		//2 way
		
		int largest=array[0];
		int smallest=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>largest) {
				
				largest=array[i];
			}if (array[i]<smallest) {
				
				smallest=array[i];
			}
			
		}System.out.println("the largest number is "+ largest);
		System.out.println("The smallest number is "+ smallest);
		
		System.out.println("***************************************");
		
		int maxx=array[0];
		int secondmaxx=array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]>maxx) {
				
				secondmaxx=maxx;
				maxx=array[i];
				
			}else if (array[i]>secondmaxx && array[i]<maxx) {
				secondmaxx=array[i];
				
			}
			
		}System.out.println("The largest number is " +maxx);
		System.out.println("The Second laegest numbers is "+secondmaxx);

	}

}
