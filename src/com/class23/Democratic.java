package com.class23;

public class Democratic {
	
	String voterName;
	int contribute;
	static int counter;
	static String nominee;
	static int totalVotes;
	static int totalContributions;

	public void contribute() {
		
		totalContributions+=contribute;

	}
	
	public void count() {
		
		totalVotes+=counter;
	}

}
