package com.class25;

public class Programming {
	
	public void watching() {
		
		System.out.println("I love Programming Language");
	}
	
	public void watching (String str) {
		
		System.out.println("I love "+str);
	}
	
	public static void main(String[] args) {
		
		Programming obj=new Programming();
		obj.watching();
		obj.watching("Java");
				
	}

}
