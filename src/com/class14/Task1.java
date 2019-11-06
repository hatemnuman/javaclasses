package com.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
		 */
		
		String str="Hatem Numan hatem numan hatem numan hatem numan";
		String array=str.replace(" ", "");
		
		
			System.out.println(array);
			
			System.out.println("*************************************");
			
			String str1="12345Hatem numan $$#%";
			String array1=str1.replaceAll("[A-z0-9]", "");
			
			System.out.println(array1.trim());
			System.out.println(array1.trim().length());
			
			System.out.println("******************************");
			
			
			String str2="Is it saturday? Is it raining? Do we have a Java Class today?";
			
			String[] array2=str2.split("\\?");
			
			System.out.println(array2.length);
			
			
				
			}
			
			
			
			
			

	}


