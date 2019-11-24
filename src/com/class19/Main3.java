package com.class19;

public class Main3 {
	
	public static void main(String[] args) {
		Main3 obj=new Main3();
		String test=obj.makeCapital("test");
		System.out.println(test);
	}
	
	String makeCapital (String str) {
		String str1=str.toUpperCase();
		return str1;
	}

}
