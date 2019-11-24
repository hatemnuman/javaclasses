package com.class18;

public class Task3 {
	
	public static void main(String[] args) {
		
		Task3 palin=new Task3();
		
		palin.palindrom("kayak");
		palin.palindrom("Hatem");
	}
	
	void palindrom(String word) {
		
		String reversed="";
		
		for (int i=word.length()-1; i>=0;i--) {
			
			reversed=reversed+word.charAt(i);
			
		}
		System.out.println(reversed);
		
		if (word.equals(reversed)){
			
			System.out.println("The number is Palindrom");
			
		}else {
			
			System.out.println("The number is not Palindrom");
		}
		
		
	}

}


/*
 * 
 * String original="kayak";
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
*/
