package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums=new int[4];
		
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		System.out.println(nums.length);
		System.out.println();
		
		String[] array= {"Winter","Fall","Summer","Spring"};
		System.out.println("i was born in "+ array[2]);
		int arraySize=array.length;
		System.out.println(arraySize);

	}

}
