package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		for (int i=0; i<=list.size();i++) {
			
			if (i%2!=0) {
				
				System.out.println(list.get(i));
			}
		}
		
	}

}
