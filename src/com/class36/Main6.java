package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			

			System.out.println(key + " : " + value);

		}
		System.out.println("----------------------------");
		
		

//		Iterator<String> it2 = set.iterator();
//		while (it2.hasNext()) {
//			String key = it2.next();
//			String value = map.get(key);
//			
//			if(key.contains("ONE"))
//				it2.remove();
//
//			System.out.println(key + " : " + value);
//
//
//	}

	}
}