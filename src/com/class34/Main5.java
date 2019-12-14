package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class Main5 {

	public static void main(String[] args) {
		
		HashSet<String > hSet=new HashSet<String>();
		hSet.add("first");
		hSet.add("second");
		hSet.add("third");
		hSet.add("fourth");
		hSet.add("fifth");
		
		System.out.println(hSet);
		
		Iterator<String> it=hSet.iterator();
		while (it.hasNext()) {
			if (it.next().contains("second")) {
				it.remove();
			}
		}
		System.out.println(hSet);
		
		hSet.removeAll(hSet);
		System.out.println(hSet);
		
		
	}

}
