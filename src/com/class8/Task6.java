package com.class8;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break vs continue
		//break exits the loop
		//continue skip current iteration
		
		for (int a=1; a<=10; a++) {
			if (a==5 || a==6 || a==7) {
				continue;
			}System.out.println(a);
		}
	}

}
