package com.class31;

public class PercentageTest {

	public static void main(String[] args) {
		Mark obj=new studentA(90, 80, 50);
		double firstPer=obj.getPercentage();
		System.out.println(firstPer);
		Mark obj2=new studentB(70, 60, 60, 90);
		double secondPer=obj2.getPercentage();
		System.out.println(secondPer);
		

	}

}
