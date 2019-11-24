package com.class23;

public class Elections {
	
	public static void main(String[] args) {
		Republican voter1=new Republican();
		Republican.nominee="Trump";
		voter1.voterName="Qais";
		voter1.contribute=100;
		Republican.collection(voter1.contribute);
		voter1.info();
		voter1.count();
		
		
		Republican voter2=new Republican();
		voter2.voterName="Hamza";
		Republican.contribute=300;
		Republican.collection(voter1.contribute);
		voter2.info();
		voter2.count();
		
		System.out.println("the total of thecontribution is "+ Republican.totalContributions+"Total of voters are"+Republican.counter);
		
		
	}

}
