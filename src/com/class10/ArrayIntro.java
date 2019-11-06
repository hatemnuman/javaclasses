package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 10;

		int a1 = 10;

		int[] b;// declare an array--->preferred
		int c[];
		
		
		b=new int[4];
		
		//all in 1 -----> declaration and initialization
		
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		System.out.println(array[2]);
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manaual Tewsting";
		classes[3]="GIT";
		
		System.out.println("Today we have "+ classes[0]+ "class");
		
		
		int[] num=new int[3];
		num[0]=1;
		num[1]=1;
		num[2]=1;
		
		//how to chnage 1 to 100
		
		num[1]=100;
		
		System.out.println(num[0]);
		System.out.println(num[0]+num[2]);
				

	}

}
