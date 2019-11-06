package com.class5;

import java.util.Scanner;
//crt shift+O
public class MoreLogicalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		double slaesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your sales amount");
		slaesAmount=scan.nextDouble();
		
		if (slaesAmount<100) {
			
			commission=slaesAmount*0.1;
			
		}else if (slaesAmount>=100 &&slaesAmount<200) {
		
			commission=slaesAmount*0.2;	
		

	}else if (slaesAmount>=200 && slaesAmount<500) {
		
		commission=slaesAmount*0.3;	
	}else {
		commission=0;
	}
		System.out.println("Your commionn is "+ commission);
		}

}
