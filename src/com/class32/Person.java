package com.class32;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthday;
	private int birthYear;
	private String ssn;
	
	Person( String firstName,String lastName,int birthMonth,int birthday, int birthYear, String ssn){
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthMonth=birthMonth;
		this.birthday=birthday;
		this.birthYear=birthYear;
		this.ssn=ssn;
		
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public void fName(String firstName) {
		
	}
	public String getLastName() {
		return lastName;
		
	}
	
	public void lName(String lastName) {
		
	}
	public int getBirthMonth() {
		return birthMonth;

		
	}
	
	public void bMonth(int birthMonth) {
		
	}
	public int getBirthDay() {
		return birthday;
		
	}
	
	public void bDay(int birthDay) {
		
	}
	
	public int getBirthYear() {
		return birthYear;
		
	}
	
	public void bYear(int birthYear) {
		
	}
	public String getSsn() {
		return ssn;
		
		
	}
	public void ssNumber(int ssn) {

	}
	
	public void displayBirth() {
		System.out.println(birthMonth+"/"+birthday+"/"+birthYear);
	}

}
