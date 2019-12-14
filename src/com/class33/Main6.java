package com.class33;

import java.util.*;

public class Main6 {

	public static void main(String[] args) {
		
		List<Boolean> A=new ArrayList<>();
		A.add(true);
		A.add(true);
		A.add(false);
		
		List<Boolean> B=new ArrayList<>();
		B.addAll(A);
		B.addAll(A);
		
		System.out.println(B);
		
		
		
		
	}

}
