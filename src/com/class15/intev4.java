package com.class15;

public class intev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is very cold outside";
		
		String subString=str.substring(0, 5);
		
		System.out.println(subString);
		
		System.out.println("*************************************");
		
		String [] words=str.split(" ");
		System.out.println(words.length);

	}

}
