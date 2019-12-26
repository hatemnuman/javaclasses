package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class TaskBestBuy {

	public static void main(String[] args) {
		Map<Integer, String> bestBuy= new TreeMap<>();
		
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(1234567, "Computer");
		bestBuy.put(7654321, "Ipad");
		bestBuy.put(1346791, "Laptop");
		
		System.out.println(bestBuy);
		System.out.println("************eash Loob*************");
		
		//Set<Map.Entry<Integer, String>> set=bestBuy.entrySet();
		
		for(Map.Entry<Integer, String> entry:bestBuy.entrySet()) {
			
			System.out.println(entry.getKey() +"="+entry.getValue());
			
		}
		
		System.out.println("*********Iterator***************");
		
		Iterator<Map.Entry<Integer, String>> it=bestBuy.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			
			
			
			
		}
		
	}

}
