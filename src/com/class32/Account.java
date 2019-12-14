package com.class32;

public class Account {

	private long acc_no;  
	private String name,email;  
	private double amount;  
	
	
	public long getAccount() {
		return acc_no;
		
	}
	 public void account(long acc_no) {
		 
		 this.acc_no=acc_no;
	 }
	 
	 public String getemail() {
		 return email;
	 }
	 
	 public void email(String email) {
		 this.email=email;
		 
	 }
	 
	 public String getname() {
		return name;
		 
	 }
	 public void name(String name) {
		 this.name=name;
		 
	 }
	 
	 public double getamount() {
		return amount;
		 
	 }
	 public void amount(double amount) {
		 
		 this.amount=amount;
	 }
	 
}
