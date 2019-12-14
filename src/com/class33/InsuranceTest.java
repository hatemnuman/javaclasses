package com.class33;

import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		List<Insurance> list=new ArrayList<>();
		list.add(new Car("All State", "Honda"));
		list.add(new Pet("Geico", "Dog"));
		list.add(new Health("American Insurance"));
		
		System.out.println("************For Loop**************");
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).getQuote();
			list.get(i).cancelInsurance();
		}
		
		System.out.println("************advanced for loop***************");
		
		for (Insurance element:list) {
			element.getQuote();
			element.cancelInsurance();
			
		}
		
		System.out.println("*****************iterator***************");
		
		Iterator<Insurance> it= list.iterator();
		while (it.hasNext()) {
			Insurance myIt=it.next();
			myIt.getQuote();
			myIt.cancelInsurance();
		}
		

	}

}
