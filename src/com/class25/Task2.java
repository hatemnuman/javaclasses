package com.class25;

public class Task2 {
	
	public static void m() {
		
		System.out.println("This my first method");
	}
	
	public static void m(int num) {
		
		System.out.println("This is my "+num+ "nd Method");
	}
	
	public static void m (String str, String str2) {
		
		System.out.println(str+ " is my favarite "+ str2);
	}
	
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		obj.m();
		obj.m(2);
		obj.m("Java", "Class");
		
	}

}
