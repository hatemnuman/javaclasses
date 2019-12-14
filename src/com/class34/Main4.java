package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class Main4 {

	public static void main(String[] args) {
		
		HashSet<String> hSet=new HashSet<>();
		hSet.add("null");
		hSet.add("shiva");
		hSet.add("sandish");
		hSet.add("asel");
		hSet.add("sumair");
		
		System.out.println(hSet);
		
		Iterator<String> it=hSet.iterator();
		while (it.hasNext()) {
			if (it.next().contains("null")) {
				boolean boo=true;
				
				System.out.println(boo);
			}
			
		}
		
		

	}

}
