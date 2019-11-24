package com.class20;

public class myReversed {

	public static void main(String[] args) {
		
		reversed obj=new reversed();
		
		String name=obj.reverse("hatem");
		
		System.out.println(name);
		
		reversed obj2=new reversed();
		boolean pali=obj2.palindrom("madam");
		
		System.out.println(pali);
		
		

	}

}
