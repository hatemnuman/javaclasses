package com.class19;

public class Main6 {
	
	
	public static void main(String[] args) {
		Main6 obj=new Main6();
		
		char result=obj.getChar("hello", 1);
		
		System.out.println(result);
	}
	
	char getChar(String word, int index ) {
		
		char myLetter=word.charAt(index);
		
		return myLetter;
	}

}
