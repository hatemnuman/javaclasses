package com.class15;

public class intev6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="kayak";
		String reversed="";
		
		for (int i =original.length()-1; i>=0 ; i--) {
			
			reversed=reversed+original.charAt(i);
			
		}
		
		System.out.println(reversed);
		
		
		if(original.equals(reversed)){
			
			System.out.println("palindrom");
			
			
		}else {
			
			System.out.println("Its not ");
		}
		
		

	}

}
