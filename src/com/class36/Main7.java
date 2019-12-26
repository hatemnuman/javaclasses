package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main7 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		
		System.out.println("HashMap Before Replace :");
		
		Set<Entry<String,String>> set=map.entrySet();
		
		Iterator<Entry<String, String>> it= set.iterator();
		while (it.hasNext()) {
			Entry<String, String> entry=it.next();
			
			
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");
		
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		Iterator<Entry<String, String>> it2= set.iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry=it2.next();
			
			
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		

	}

}
