package com.class36;

import java.util.ArrayList;
import java.util.List;

import sun.awt.DisplayChangedListener;

class Name{
	
	String name;
	
	public Name(String name) {
		this.name=name;
		
	}
	
	public void display() {
		System.out.println(name);
	}
	
	
}

public class Main2 {

	public static void main(String[] args) {
		
		List<Name> list=new ArrayList<>();
		
		list.add(new Name("John"));
		list.add(new Name("Brian"));
		list.add(new Name("Ryan"));
		
		//System.out.println(list.size());
		
		for (Name element:list) {
			
			//System.out.println(element.name);
			element.display();
		}
		
		

	}

}
