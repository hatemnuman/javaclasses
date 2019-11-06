package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grade= new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("your Grade is "+grade[1]);
		
		char[] grade1= {'A','B','C','D','E','F'};
		System.out.println("your Grade is "+grade1[5]+grade1[4]);
		
		for (int i=0; i<grade1.length; i++) {
			System.out.println(grade1[i]);
		}
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		
		int size=animals.length;
		for (int i=0; i<size;i++) {
			
			System.out.print(animals[i]+" ");
			
		}
		
		double[] num= {1.20,2.20,3.20,4.20};
		int size1=num.length;
		for (int i=0; i<size; i++) {
			System.out.print(num[i]+";");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
