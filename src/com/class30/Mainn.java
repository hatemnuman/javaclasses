package com.class30;

public class Mainn implements ChildInterface{
		 
		 public static void main(String[] args) {
			 
			ChildInterface obj=new Mainn();
			obj.parentMethod();
			obj.mytMethod();
		}

		@Override
		public void parentMethod() {
			System.out.println("Parent Method-----welcome to syntax solutions");
			
		}

		@Override
		public void mytMethod() {
			System.out.println("Child Method-----hi syntax solutions how are you");
			
		}
		 
	 }
