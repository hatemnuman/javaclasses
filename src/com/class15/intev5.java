package com.class15;

public class intev5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Welcom to the java class";
		
		String reversed="";
		
		String[] str=given.split(" ");
		
		for (int i =str.length-1; i >=0 ; i--) {
			
			reversed=reversed+str[i]+ " ";
			
		}
		System.out.println(reversed);
		
		System.out.println("***************************");
		
		char[] wether=given.toCharArray();
		for (int i =wether.length-1;i >=0;i--) {
			
			System.out.print(wether[i]);
			
			
		}
		
	
		
		

	}

}
