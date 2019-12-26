package com.class35;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		Map<String, String> map=new TreeMap<>();
		
		map.put("Jordan", "Amman");
		map.put("USA", "Washington DC");
		map.put("Palestain", "Joresalim");
		
		
		
		Set<String> set=map.keySet();
		
		for (String element:set) {
			
			System.out.println(set+" "+map.get(set));
		}
		
		
	}

}
