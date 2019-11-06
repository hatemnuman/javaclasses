package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		int quiz;
		int midTerm;
		int finalScore;
		int average;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter queiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter midTerm score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter finalScore score");
		finalScore=scan.nextInt();
		
		
		average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			
			System.out.println("A");
			
		}else if (average>=70 && average <90) {
			
			System.out.println("B");
		}else if (average<50) {
			System.out.println("D");
		}else {
			
			System.out.println("UnKnown");
		}
		
		
		
				

	}

}
