package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class Main6 {

	public static void main(String[] args) {

		
		HashSet<String > hSet=new HashSet<String>();
		hSet.add("first");
		hSet.add("second");
		hSet.add("third");
		hSet.add("fourth");
		hSet.add("fifth");
		
		Iterator<String> it=hSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			
		}
		
		
	}

}
