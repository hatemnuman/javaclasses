package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Class schedual 
		 * if tuesday -->sdlc
		 * if wednesday --> Java review
		 * if thursday-->sdlc
		 * if saturday -->Java coding
		 * if sunday my favorite Java coding
		 */

		//int day=2;
		
		int day;
		day=1;
		
		if (day==2) {
			
			System.out.println("SDLC Class");
		}else if (day==3) {
			
			System.out.println("Java Review");
		}else if (day==4) {
			
			System.out.println("sdlc");
		}else if (day==6) {
			
			System.out.println("Java coding");
		}else if (day==7) {
			
			System.out.println("Java Review");
		}else {
			
			System.out.println("There is no class at school");
		}
	}

}
