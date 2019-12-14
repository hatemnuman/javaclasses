package com.class33;

import java.util.*;

public class Main7 {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<>();
		
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		int sum=0;
		
		
		for (int i=0;i<=list.size()-1; i++) {
			
			sum+=list.get(i);
		}
		
		System.out.println(sum);
		
	}

}
