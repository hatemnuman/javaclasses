package com.class27;

public class Card {
	
	public void chargeInterest() {
		
		System.out.println("Card charge 25% interest");
	}
	
	public void creditLimit() {
		
		System.out.println("Credits limit of the card is 500");
	}
	
	

}

class AX extends Card{
	
	
	
}
class MC extends Card{
	
public void creditLimit() {
		
		System.out.println("Credit Limit of the card is 15000");
	}
	
	public void cashBack() {
		
		System.out.println("MC givves cash back of 3%");
	}
	
	
}
class Visa extends Card{
	
	
	
	
}
