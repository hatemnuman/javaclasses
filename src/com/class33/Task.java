package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Mazda");
		
		
		Iterator<String> iterator= cars.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("***************************");
		
		for (int i=0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
		}

	}

}
