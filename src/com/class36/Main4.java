package com.class36;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {

		Map<String, String> map=new LinkedHashMap<>();
		
		map.put("Street", "Street");
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		Iterator<String> it=map.keySet().iterator();
		while (it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
	}

}
