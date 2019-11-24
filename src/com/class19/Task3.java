package com.class19;

public class Task3 {
	
	char getGrade(int grade) {
		
		char mygrade;
		
		if (grade>90) {
			
			mygrade='A';
			
		}else if (grade<80) {
			mygrade='B';
		}else if (grade<70) {
			mygrade='C';
		}else if (grade<50) {
			mygrade='D';
			
		}else {
			mygrade='F';
		}
		return mygrade;
		
	}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		char finalGrade=obj.getGrade(70);
		
		System.out.println(finalGrade);
	}
	
	

}

//Create class Student that will have a method getGrade. Your method should accept the score of a student and return a
//grade: score > 90 - A score >80 - B score >70 - C score > 50 - D anything
//else - F
