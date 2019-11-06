package com.class8;

import java.util.Scanner;

public class Hawa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in)    ;
		System.out.println("Please Enter a number" );
		       int number=scan.nextInt();
		       String result="";
		       if(number>=400 && number<=600) {
		       result="Don't calculate commission";
		       }
		       else if(number>600) {
		       result="Value is too large";
		   }else {
		       result="Calculate commission";
		   }System.out.println(result);
		   
		    
		       
		   }
	

}


