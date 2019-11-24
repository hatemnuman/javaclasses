package com.class19;

public class Main5 {
	
	public static void main(String[] args) {
		Main5 obj=new Main5();
		
		double result=obj.negate(-2.0);
		
		System.out.println(result);
	}
	
	double negate(double num) {
		double myNumber = 0;
		
		
		if (num>0) {
		
		myNumber=num-(num*2);
		
		}else if (num<0) {
			
			myNumber=num+(num*-2);
		}
		
		return myNumber;
		
	}

}
