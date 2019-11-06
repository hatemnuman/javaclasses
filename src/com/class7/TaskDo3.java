package com.class7;

import java.util.Scanner;

public class TaskDo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int i=5;
		while (i<10) {
			System.out.println("PLease ente you name");
			String name=scan.nextLine();
			System.out.println("Good Morning"+ name);
		}

	}

}
