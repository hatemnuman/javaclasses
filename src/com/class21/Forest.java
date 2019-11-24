package com.class21;

public class Forest {
	public static void main(String[] args) {
		
		Wolf w1=new Wolf();
		w1.wolfAge=1;
		w1.wolfColor="Black";
		Wolf.wolfNumberOfWolf++;		
		w1.wolfInfo();
		
		Wolf w2=new Wolf();
		w2.wolfAge=2;
		w2.wolfColor="Brown";
		Wolf.wolfNumberOfWolf++;		
		w2.wolfInfo();
		w2.wolfNumber();
		
		
		
		Fox f1=new Fox();
		f1.foxColor="Red";
		f1.foxSpeed=50;
		Fox.foxnNmberOfWolf++;
		f1.foxInfo();
		
		
		Fox f2=new Fox();
		f2.foxColor="Orange";
		f2.foxSpeed=40;
		Fox.foxnNmberOfWolf++;
		f2.foxInfo();
		f2.foxNumber();
		
		Bear b1=new Bear();
		b1.BearType="Grizzly";
		b1.BearWeight=500;
		Bear.BearNumberOfBears++;
		b1.bearInfo();
		
		Bear b2=new Bear();
		b2.BearType="Wild";
		b2.BearWeight=700;
		Bear.BearNumberOfBears++;
		b2.bearInfo();
		b2.bearNumber();
		
		
		
		
		
	}

}
