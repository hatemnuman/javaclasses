package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if(!traffic) {
			
			System.out.println("Hello");
		}else {
			
			System.out.println("Bye");
		}
		boolean isRain=false;
		if (!isRain) {
			
			System.out.println("Take the umbrella");
		}
		int num1=10;
		int num2=10;
		
		if (num1==num2) {
			
			System.out.println("Number are eual");
		}else {
			System.out.println("are not equal");
		}
		if (!(num1==num2)) {
			
			System.out.println("Numbers are not equal");
		}else {
			
			System.out.println("Number are equal");
		}
		
		String name="Marry";
		String name2="Anna";
		
		if (!(name.equals("Marry") || name.equals("Anna"))) {
			
			System.out.println("YOu are not my sister");
		}else {System.out.println("You are not my sister");
		
		}

	}

}
