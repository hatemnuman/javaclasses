package com.class24;

public class Child2 extends Parent {
	
	public void draw() {
		
		System.out.println("Child 2 can draw");
	}	
	
	
	public static void main(String[] args) {
		
		Child2 obj=new Child2();
		System.out.println(obj.eyeColor);
		System.out.println(obj.hairColor);
		System.out.println(Child2.race);
		obj.fly();
		obj.draw();
	}

}
