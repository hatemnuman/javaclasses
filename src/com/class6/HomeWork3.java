package com.class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String country, language="";
		System.out.println("Please Enter name of the country");
		country=scan.nextLine();
		switch (country) {
		case "USA":
			language="English";
			break;
		case "Italy":
			language="Spanish";
			break;
		case "Palestine":
			language="Arabic";
			break;
			default:
				language="Unknown";
				break;

		}System.out.println("The Country is "+country+ " and your language is "+language);
	}

}
