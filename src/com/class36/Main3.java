package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String , String> map=new HashMap<>();
		map.put("Street", "Street");
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		Set<Entry<String, String>> entry= map.entrySet();
		
		for (Entry<String, String> element:entry) {
			String str=map.get(element.getKey()).toUpperCase();
			
			System.out.println(str);
		}
		
//		Collection<String> value=map.values();
//		
//		for (String element:value) {
//			System.out.println(element.toUpperCase());
//		}

	}

}
