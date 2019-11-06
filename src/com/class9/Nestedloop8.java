package com.class9;

import java.util.Scanner;

public class Nestedloop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter 5 numbers");
		int myNumber = 0, oddNubmer = 0, evenNumber = 0;

		for (int i = 1; i <= 5; i++) {

			myNumber = scan.nextInt();
			if (myNumber % 2 == 0) {
				evenNumber = evenNumber + myNumber;

			} else {
				oddNubmer = oddNubmer + myNumber;

			}

		}
		System.out.println("The Sum of the even Numbers is "+evenNumber);
		System.out.println("The Sum of the odd Numbers is "+oddNubmer);
	}

}
/*
 * package com.class10;
​
import java.util.Scanner;
​
public class HW3 {
​
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter ending number");
		int secondNumber = scan.nextInt();
		
		int start = 0;
		int end = 0;
		
		if (firstNumber < secondNumber) {
			start = firstNumber;
			end = secondNumber;
		} else {
			start = secondNumber;
			end = firstNumber;
		}
		int even = 0;
		int odd = 0;
​
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("The sum of even numbers is " + even);
		System.out.println("The sum of odd numbers is " + odd);
	}
}
 */


/*
 * package com.class10;
​
import java.util.Scanner;
​
public class HW3AnotherWay {
​
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number");
		int start = scan.nextInt();
		System.out.println("Enter end number");
		int end = scan.nextInt();
​
		int even = 0;
		int odd = 0;
​
		if (start < end) {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even = even + i;
				} else {
					odd = odd + i;
				}
			}
			System.out.println("The sum of even numbers is " + even);
			System.out.println("The sum of odd numbers is " + odd);
			
		} else {//if 1num >2 num 
			System.out.println("Please enter start# less then end number");
		}
	}
}
Collapse




 * 
