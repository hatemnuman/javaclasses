package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
	
	public static void main(String[] args) {
		
		Set<String> countryList=new TreeSet<>();
		countryList.add("Jordan");
		countryList.add("USA");
		countryList.add("Canada");
		countryList.add("France");
		
		
		
		System.out.println("******Advance For");
		
		for (String country:countryList) {
			
			System.out.println(country);
		}
		
		System.out.println("************Iterator***********");
		
		Iterator<String> it= countryList.iterator();
		while (it.hasNext()) {
			String st=it.next();
			System.out.println(st);
		}
		
		System.out.println("****************Task number 2***************");
		
		Set<String> list2=new LinkedHashSet<>();
		list2.add("Amman");
		list2.add("Roma");
		list2.add("Vienaa");
		
		Iterator<String> itt= list2.iterator();
		while (itt.hasNext()) {
			String city=itt.next();
			city=city.toUpperCase();
			if (city.startsWith("A")) {
				
				itt.remove();
			}
			
			
		}System.out.println(list2);
		
		
	}
	

}
