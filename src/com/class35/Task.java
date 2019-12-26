package com.class35;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Synatx");
		map.put(3, "Fabcebook");
		map.put(4, "Instegram");
		map.put(5, "HP");
		map.put(6, "Dell");
		map.put(7, "Instegram");
		
		
		int floor=map.size();
		System.out.println(floor);
		
		map.replace(4, "Samsung");
		
		System.out.println(map);
		
		map.remove(4);
		System.out.println(map);
		
	}

}
