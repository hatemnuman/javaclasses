package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main5 {

	public static void main(String[] args) {
		
		Map<Integer, Double> map=new TreeMap<>();
		
		map.put(1, 1.1);
		map.put(2, 2.2);
		map.put(3, 3.3);
		map.put(4, 4.4);
		map.put(5, 5.5);
		
		Set<Entry<Integer, Double>>entry=map.entrySet();
		
		boolean flag=true;
		
		for(Entry<Integer, Double> element :entry) {
			Integer key=element.getKey();
			Double value=element.getValue();
			
			if (key==3) {
				System.out.println(flag);
			}if (value==4.4) {
				System.out.println(flag);
			
				System.out.println(false);
			}
				
				
			//System.out.println(element.getKey()+"    "+element.getValue());
		
		
	}

}
}