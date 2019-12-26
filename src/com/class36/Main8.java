package com.class36;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class test{
	
	public void Display (Map<String, Integer>map) {
		
		if (!map.isEmpty()) {
			Set<Entry<String,Integer>> set=map.entrySet();
			for (Entry<String,Integer> entry:set) {
				
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
		}else {
			System.out.println("map is empty");
		}
		
	}
}

public class Main8 {

	public static void main(String[] args) {
		
		Map<String , Integer> map=new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		
		test obj= new test();
		obj.Display(map);
		map.clear();
		obj.Display(map);
		
	}

}
