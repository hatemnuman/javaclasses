package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=3;
		
		if (day==2 || day==4) {
			
		System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			
			System.out.println("Java Class");
		}else if (day==1 || day==5) {
			
			System.out.println("no class");
		}else if (day==3) {
			
		System.out.println("Review Class");
		}else {
			
			System.out.println("Not a valid day");
		}
		
		String weekday="Tuesday";
		if (weekday.equals("Tuesday") || weekday.equals("Thursday")) {
			System.out.println("SDLC Class");
			
		}else if (weekday.contentEquals("Saturday") || weekday.equals("Sunday")) {
			System.out.println("Java Class");
			
		}else if (weekday.equals("Monday")) {
			
		}System.out.println("No class");
		

	}

}
