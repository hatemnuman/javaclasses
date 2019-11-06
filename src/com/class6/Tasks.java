package com.class6;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in Java all local variables MUST be initialized before using them
		//Defult Value
		//string--> null
		//Boolean -->  false
		//Double-->0.00

		int time =10;
		String timeOfDay="";

		if (time >= 1 && time <= 11) {

			timeOfDay = "Morning";
		} else if (time > 11 && time <= 15) {

			timeOfDay = "Noon";
		} else {
			System.out.println("Invalid");

		}
		System.out.println("The time of the day is " +timeOfDay);

		if (timeOfDay.equals("Morning")) {

			System.out.println("Good Morning");

		}
	}
}
