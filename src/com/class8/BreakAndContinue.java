package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * navigate to the sysntax page;
		 * we found 7 numLinks
		 * for (int i=1; i<numLink; i++){
		 * if (linkName)
		 * 
		 * }
		 */
		for (int i=0; i<10; i++) {
			if (i==2) {
				break;
				//break keyword breaks/ exist the loop
			}
			System.out.println(i);
		}
		System.out.println("Im out side the loop");
		
		//continue - it will skip current interation
		
		for (int i=1; i<=5; i++) {
			if (i==3 || i==4) {
				continue;
				
			}System.out.println(i);
		}System.out.println("Im out the loop");
		
		
	}

}
