package com.class18;

public class Intro {
	//
	
	int students, teachers, classRoom;
	String name, address, website;
	
	
	void study() {
		
		System.out.println("Student study at "+ name);
	}
	
	void teach() {
		
		System.out.println("Teachers teching at "+ name);
	}
	
	public static void main(String[] args) {
		
		Intro school=new Intro();
		school.name="Syntax";
		school.students=200;
		school.study();
		
	}

}
