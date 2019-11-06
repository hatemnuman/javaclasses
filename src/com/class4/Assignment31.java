package com.class4;

import java.util.Scanner;

public class Assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter the length ");
	    double length=scan.nextDouble();
	    System.out.println("Please enter the width ");
	    double width=scan.nextDouble();
	    
	  if (length>width){
	    System.out.println("The shape of your object is rectangle");
	  }else if (length==width){
	    System.out.println("The shape of your object is square");

	}

}
}