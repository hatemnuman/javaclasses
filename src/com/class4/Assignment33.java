package com.class4;

import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sacn=new Scanner(System.in);
		   System.out.println("Please Enter The Number");
		   int x=sacn.nextInt();
		   
		 if ((x>=1) && (x<=12)) {
		   if(x==1){
		     System.out.println(x+" will display January");
		   }else if(x==2){
		     System.out.println(x+" will display February");
		   }else if(x==3){
		     System.out.println(x+" will display March");
		   }else if(x==4){
		     System.out.println(x+" will display April");
		   }else if(x==5){
		     System.out.println(x+" will display May");
		   }else if(x==6){
		     System.out.println(x+" will display June");
		   }else if(x==7){
		     System.out.println(x+" will display July");
		   }else if(x==8){
		     System.out.println(x+" will display August");
		   }else if(x==9){
		     System.out.println(x+" will display September");
		   }else if(x==10){
		     System.out.println(x+" will display October");
		   }else if(x==11){
		     System.out.println(x+" will display November");
		   }else if(x==12){
		     System.out.println(x+" will display December");
		   }
		   
		 }else {
		   System.out.println("Invalid");

	}
	}
}
