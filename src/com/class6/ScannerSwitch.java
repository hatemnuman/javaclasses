package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country, foodName;
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter your Country");

		country = scan.nextLine();
		//boolean=scan.nextBoolean()
		switch (country) {
		case "Turky":
			foodName = "Kebab";
			break;
		case "Ethioia":
			foodName = "Tibas";
			break;
		case "Palistain":
			foodName = "Mansaf";
			break;
			default:
				foodName="UnKnown";
		}		System.out.println("YOu are from "+country+ " and your food is "+foodName);


	}

}
