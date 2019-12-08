package com.class28;

public class UserClass {

	// Write program: userClass that has a constructor that initializes name and
	// mobile number istance variables. Create a subclass userInfo that will have
	// user address variable and it also being initialized through constructor call.
	// Print users name, mobile number and address in userDetails method. Test your
	// code.

	String name;
	int phoneNumber;

	public UserClass(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

}

class UserInfo extends UserClass{
	String userAddress;
	
	public UserInfo(String name, int phoneNumber, String userAddress ) {
		super(name,phoneNumber);
		this.userAddress=userAddress;
		
		
	}
	
	public void printInfo() {
		
		System.out.println("User Name: "+name+" Mobile Number "+phoneNumber+" Adress: "+ userAddress);
		
	}
	
	
}


