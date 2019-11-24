package com.class19;

public class Main7 {
	
	public static void main(String[] args) {
		
		Main7 obj=new Main7();
		boolean result=obj.bothEven(3, 2);
		
		System.out.println(result);
	}
	
	boolean bothEven(int num1, int num2) {
		
		boolean even = false;
		
		if (num1%2==0 && num2%2==0) {
			
			even=true;
			
		}
		return even;
		
	}

}
