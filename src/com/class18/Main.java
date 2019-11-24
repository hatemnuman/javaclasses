package com.class18;

public class Main {
	
	public static void main(String[] args) {
		
		Main call=new Main();
		call.PrintTwice("Don't make me say this twice!");
		
	}
	
	
	void PrintTwice(String str) {
		
		for (int i=1; i<=2; i++) {
			
			System.out.println(str);
		}
		
		
	}

}
