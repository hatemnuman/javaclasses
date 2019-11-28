package com.class25;

public class ShoppingStore {

	String item;
	double price;
	int quantity;

	ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;

	}

	double itemTotalPrice() {

		double sum = price * quantity;

		System.out.println(item + " Total Value " + sum);
		
		return sum;
		

	}


   

	
	

}
