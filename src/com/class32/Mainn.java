package com.class32;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj=new Account();
		obj.account(756050400);
		obj.email("sumair@syntaxsolutions.com");
		obj.name("Sumair");
		obj.amount(500000.0);
		
		System.out.println(obj.getAccount()+" "+obj.getname()+" "+obj.getemail()+" "+obj.getamount());
	}

}
