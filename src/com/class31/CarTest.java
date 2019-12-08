package com.class31;

public class CarTest {

	public static void main(String[] args) {
		
		Truk obj=new Truk();
		obj.carPrice=1000;
		obj.weight=1000;
		double dis=obj.calculateSalePrice();
		
		System.out.println(dis);
		
		Sadan obj2=new Sadan();
		obj2.carPrice=2000;
		obj2.length=70;
		
		double dis2=obj2.calculateSalePrice();
		
		System.out.println(dis2);
		
	}

}
