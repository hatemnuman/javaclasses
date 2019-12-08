package com.class29;

public abstract class Parent {
	
	public abstract void open();
	
	public void edit() {
		
		System.out.println("To edit you need to  change some orders");
	}
	
	public void close () {
		
		System.out.println("Before you close the Java program you need to save ");
	}
	

}

class WordFile extends Parent{

	@Override
	public void open() {
		System.out.println("to open the wordFile you need the app");
		
	}
	
}
class PDFFile extends Parent{
	
	public void open () {
		
		System.out.println("To Open PDF file you need the app");
		
		
	}

	}
	
