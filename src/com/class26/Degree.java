package com.class26;

public class Degree {

	public void getDegree() {

		System.out.println("I got a degree");
	}

}

class Undergraduate extends Degree {
	
	public void getDegree() {
		
		System.out.println("I am an undergradute");
	}

}

class Postgraduate extends Degree{
	
	public void getDegree() {
		
		System.out.println("I am an PostGraduate");
	}

}

