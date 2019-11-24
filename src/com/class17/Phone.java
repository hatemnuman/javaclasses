package com.class17;

public class Phone {
	
	String name, colore;
	int price;
	
	
	void playGame() {
		
		System.out.println("I can play game on my "+ name);
		
		
	}
	
	void watchingMovie() {
		
		System.out.println("i can watch movie on my "+ name);
	}
	
	public static void main(String[] args) {
		
		Phone iphone=new Phone();
		iphone.colore="Black";
		iphone.name="Iphone";
		iphone.price=700;
		
		iphone.watchingMovie();
		iphone.playGame();
		
		Phone Android=new Phone();
		Android.colore="Red";
		Android.name="Android";
		Android.price=500;
		
		Android.watchingMovie();
		Android.playGame();
		
		Phone Nokia=new Phone();
		Nokia.colore="Red";
		Nokia.name="Nokia";
		Nokia.price=300;
		
		Nokia.watchingMovie();
		Nokia.playGame();
		
		
		
		System.out.println("I have an "+iphone.name+" and the color is "+iphone.colore );
		
		
		
		
		
	}
	
	
	

}


