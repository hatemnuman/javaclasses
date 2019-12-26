package com.class36;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {

		Map<String, String> pairs = new HashMap<>();
		pairs.put("Street", "Patrick ST");
		pairs.put("Suite", "265");
		pairs.put("City", "Vienna");
		pairs.put("Zip", "22180");
		pairs.put("Country", "United State");

		Set<String> set = pairs.keySet();
		for (String list : set) {

			System.out.println(pairs.get(list));

		}

		System.out.println("*********Iterator**************");

		Iterator<String> it = pairs.keySet().iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println("The Key is " + str + "the Value is " + pairs.get(str));
		}

	}

}
