package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("hi");
		list.add("yo");
		list.add("sub");
		list.add("yolo");
		list.add("boop");
		
		for (int i=0; i<=list.size()-1;i++) {
			
			if (i==1 || i==2 || i==4) {
				
				System.out.println(list.remove(i));
			}
			
			
		}
		
		
	}

}
