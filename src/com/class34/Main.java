package com.class34;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<String> hSet=new HashSet<>();

		hSet.add("Red");
		hSet.add("Pink");
		hSet.add("Yellow");
		hSet.add("White");
		hSet.add("Black");
		
		System.out.println("Original Hash Set: "+hSet);
		System.out.println("Size of the Hash Set: "+hSet.size());

	}

}
