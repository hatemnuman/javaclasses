package com.class21;

public class SubClass {
	 //Declare variables here
	
	protected int integerNumber = 222;
	protected void two() {
		
		System.out.println(integerNumber);
	}
	
	}

	class Main {
	  public static void main(String[] args) {
		  
		  SubClass s1=new SubClass();
		  for (int i = 0; i < 2; i++) {
			  s1.two();
		}
	    
	  }
	}

