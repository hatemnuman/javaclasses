package com.class10;

public class ArrayIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*array is acontainer that can hold values of same type
		 * int[] array=mew int [3]----> we are creating an array of integers with the size of3
		 * 
		 * we cant store other types inside the array
		 * int [] array=new int 
		 * 
		 */

		String[] name = new String[3];

		name[0] = "Dina";
		name[1] = "Hatem";
		name[2] = "Hawa";

		// name[3] = "Moe"; during run time we will get an exception

		System.out.println(name[2]);
		
		
		int [] number=new int[4];
		number[1]=100;
		number[3]=200;
		
		System.out.println(number[0]);

	}

}
