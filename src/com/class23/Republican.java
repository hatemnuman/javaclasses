package com.class23;

public class Republican {

	String voterName;
	static int contribute;
	static int counter;
	static String nominee;
	static int totalVotes;
	static int totalContributions;

	public static void collection(int contribute) {
		
		totalContributions+=contribute;

	}
	
	public void count() {
		
		counter++;
		
	}
	
	public void info() {
		
		System.out.println("Name of the nNominee is "+nominee+" Name of the voter is  "+voterName+" the amount that he contribute is "+contribute);
		
		
	}

}
