package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main9 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 40);
		
		map.replace("orange", 50);
		
		Set<Entry<String, Integer>> set=map.entrySet();
		
		Iterator<Entry<String,Integer>> it=set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		

	}

}
