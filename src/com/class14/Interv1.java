package com.class14;

public class Interv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1.Writeaprogramtoswap2numberswithoutatemporaryvariable?Swap2stringswithout 
		 * a temporary variable?
		 */
		
		int x=10;
		int y=5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("X was = 10 and now = "+x);
		System.out.println("Y was =5 and now = "+y);
		
		String a = "Hatem";  
        String b = "Numan";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b); 

	}

}
