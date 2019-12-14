package com.class34;

import java.util.HashSet;

public class Main1 {

	public static void main(String[] args) {
		
		HashSet<Integer> lhSet=new HashSet<>();
		lhSet.add(111);
		lhSet.add(111);
		lhSet.add(111);
		lhSet.add(999);
		lhSet.add(999);
		lhSet.add(999);
		
		for(Integer element:lhSet) {
			
			System.out.println(element);
		}
		
		
	}

}
