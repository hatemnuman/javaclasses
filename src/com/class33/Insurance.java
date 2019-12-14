package com.class33;

public abstract class Insurance {
	
	String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
		
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
	

}

class Car extends Insurance{
	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		
	}

	@Override
	public void getQuote() {
		
		System.out.println("Getting the Quote for thr car "+carModel+" from "+ insuranceName);
		
		
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("Cancelling the insurance from "+insuranceName+ " for the "+carModel);
		
		
	}
	
}
class Pet extends Insurance{
	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
		
	}

	@Override
	public void getQuote() {
		
		System.out.println("Getting the Quote for thr pettype "+petType+" from "+ insuranceName);
		
		
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("Cancelling the insurance from "+insuranceName+ " for the me "+petType);
		
		
	}
	
}

class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("Getting the Quote for me from "+ insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelling thmy  insurance from "+insuranceName);		
	}
	
}