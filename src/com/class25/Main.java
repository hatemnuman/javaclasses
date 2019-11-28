package com.class25;

public class Main {
	
	 public static void main(String[] args) {
	      ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      
	      //Complete the Application
	      
//	      blancket.itemTotalPrice();
//	      mattress.itemTotalPrice();
	      
	      double blanTotal=blancket.itemTotalPrice();
	      double matTotal=mattress.itemTotalPrice();
	      
	      double sum=blanTotal+matTotal;
	      
	     System.out.println("You purchased "+ sum+" Today");
	    		  
	  }
	}