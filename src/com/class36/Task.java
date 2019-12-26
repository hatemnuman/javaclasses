package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class Task {
	
//	Create a Map from array of cities that will sort keys in alphabetical order. 
//	As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city ( use Iterator ). 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map= new TreeMap<>();
		
		map.put("Paris", 5);
		map.put("Moscow", 7);
		map.put("Amman", 8);
		map.put("Vienna", 9);
		map.put("FairFax", 10);
		map.put("Washington DC", 11);
		
		System.out.println(map);
		
		Set<String> entry=map.keySet();
		
		Iterator <String> it=map.keySet().iterator();
		
		while (it.hasNext()) {
			String name=it.next();
			
			if (name.length()>7) {
				it.remove();
			}
			
			
			
		}
		
		System.out.println(map);
		
		
		
		
		

	}

}
