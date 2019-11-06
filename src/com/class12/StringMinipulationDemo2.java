package com.class12;

public class StringMinipulationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println();
		//System.err.println(); print with error in red
		//System.out.println(sentence.contains()); to check if you have the word in the sentence
		
		/*
		 * Creat two String and initaialize them with some value,
		 * implement the following methods on those String
		 */
		
		String name="Hatem Mahmoud Ismail Numan";
		
		System.out.println(name.toLowerCase());
		
		String name1="HateM Mahmoud Ismail Numan";
		System.out.println(name1.toUpperCase());
		
		System.out.println(name.length());
		
		System.out.println(name.contains("oud"));
		System.out.println(name.equalsIgnoreCase(name1));
		
		//This method tests if a string starts the specified prefix begin
		String str5="Its very hot in the class";
		System.out.println(str5.startsWith("Its"));
		
		
		//This method tests if a string ends the specified prefix begin
		
		System.out.println(str5.endsWith("clas"));
		
		//boolean is empty
		/*
		 * This method checks whether a String is empty or not
		 * 
		 */
		String isEmpty="";
		System.out.println(isEmpty.isEmpty());
		
		String isEmpty1="Hatem";
		System.out.println(isEmpty1.isEmpty());
		if (!isEmpty1.isEmpty()) {
			
			System.out.println("Not Empty");
			
		}else {
			System.out.println("empty");
		}
		
		
		String sentence1="jzhkvkhvlas akhvh anihhejpgjjgoi gmkejg\nkjergjokejgmkerg rkgmeklgjlkjgkgkklkrtg smmlkgml;klkgkogkorekglkmerg mkewrjgjegjogojog";
	
		System.out.println(sentence1);
		
		
		System.out.println("****************************************");
		// concatation two string
		String str6="Hello";
		String str7="Workd";
		
		System.out.println(str6.concat(str7));
		
		
		//trim print with out spaces
		
		String str8=" How are you? ";
		System.out.println(str8.trim());
		
		//This method return the located char by using the index
		
		String Str9="We might have done early today";
		System.out.println(Str9.charAt(5));
		
		//
		String str11="We might have done mearly todanot y";
		System.out.println(str11.indexOf('m'));
		
		System.out.println(str11.indexOf('m', 4));

	}

}
