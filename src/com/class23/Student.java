package com.class23;

public class Student {

	public static String name;
	public int age;
	public int grad1, grad2, grad3;

	Student(String stName, int stAge, int stgrad1, int stgrad2, int stgrad3) {

		name = stName;
		age = stAge;
		grad1 = stgrad1;
		grad2 = stgrad2;
		grad3 = stgrad3;

	}

	public void Student() {

		System.out.println("Student Name:" + name + ", Student age: " + age + ",First Grade:" + grad1);
	}
	
	public void ave() {
		
		int ave=(grad1+grad2+grad3)/3;
		
		System.out.println("The avarege of the three grade is:  "+ave );
	}

}
