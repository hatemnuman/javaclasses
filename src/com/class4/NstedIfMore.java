package com.class4;

public class NstedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*check age if age is less than --> too young to drive
		 * therwise will check if you are old than 18--> you can get driver license if not can get drive permit
		 * 
		 */
		
		int age=16;
		
		if (age<16) {
			
			System.out.println("you are too young to drive");
		}else {
			System.out.println("you are eligibel to drive");
			if (age>=18) {
				System.out.println("uyou can drive alone");
			}else {
				System.out.println("you need you perants to drive");
			}
		}
	} 

}
