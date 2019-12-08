package com.class27;

public class Student {

	public void study() {

		System.out.println("Studnet is studing Hard");
	}

	public void buy() {

		System.out.println("The student buying all the book matirial");
	}

}

class SyntaxStudent extends Student{
	
public void study() {
		
		System.out.println("Studnet is studing Hard");
	}
	
public void syntax() {
	
	System.out.println("Stuying at Syntax");
}
	
	
	
}

class CollegeStudent extends Student {

	public void study() {

		System.out.println("Studnet is studing Hard");
	}
	
	public void college() {
		
		System.out.println("Studying at the college");
	}

}

class SchoolStudent extends Student {

	public void study() {

		System.out.println("Studnet is studing Hard");
	}
	
	public void school() {
		
		System.out.println("Studying at highSchool");
	}

}