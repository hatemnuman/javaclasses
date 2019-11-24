package com.class19;

public class Main8 {
	
	public static void main(String[] args) {
		
		Main8 obj=new Main8();
		String result=obj.makeThreeSubstr("hello", 0, 2);  
		
		//("Is \"" + str + "\" Palindrome? " + result2);
		
		System.out.println(result);
	}
	
	String makeThreeSubstr(String word, int startIndex , int endtIndex) {
		
		String str=word;
		String letter =str.substring(startIndex, endtIndex);
		
		
		for (int i = 1; i <3; i++) {
			
			System.out.print(letter);
			
			
		}return letter;
		
		
		
	}

}
