package com.class25;

public class MainC {
	
	void m1(boolean tf){
	    
	    System.out.println("Final method with boolean parameter");
	    
	  }
	  
	  void m1(String str){
	    System.out.println("Final method with String parameter");
	  }
	  
	  public static void main (String[] args){
	    MainC obj=new MainC();
	    obj.m1(true);
	    obj.m1("Syntax");
	  }

	}

