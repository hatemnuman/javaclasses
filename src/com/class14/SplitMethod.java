package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*.split(); split stroing
		 * 
		 */
		
		String str="hfgudf jgfkgor ksjhhd jshfkghjk";
		String[] array=str.split(" ");
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		// how can we find  many sentance
		
		String str1="Today is Sunday. hatem is going ";
		
		String[] array2=str1.split("\\.");
		System.out.println(array2.length);
		
		for(String string :array2) {
			
			System.out.println(string.trim());
			
		}
		
		

	}

}
