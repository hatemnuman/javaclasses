package com.class30;

public class Mainnnn implements Functions{

	@Override
	public void display(double result) {
		System.out.println(result);
		
	}

	@Override
	public double adding(double firstNumber, double secondNumber) {
		double result=firstNumber+secondNumber;
		return result;
	}

	@Override
	public double subtracting(double firstNumber, double secondNumber) {
		double result=firstNumber-secondNumber;
		return result;
	}

	@Override
	public double multiply(double firstNumber, double secondNumber) {
		double result=firstNumber*secondNumber;
		return result;
	}

	@Override
	public double dividing(double firstNumber, double secondNumber) {
		double result=firstNumber/secondNumber;
		return result;
	}
	
	public static void main(String[] args) {
		Functions obj=new Mainnnn();
		double add=obj.adding(100.0, 20.0);
		double sub=obj.subtracting(100.0, 20.0);
		double mult=obj.multiply(100.0, 20.0);
		double divd=obj.dividing(100.0, 20.0);
		
		//double result=add+sub+mult+divd;
		//System.out.println(result);
		Outputs obj2=new Mainnnn();
		obj2.display(add);
		obj2.display(sub);
		obj2.display(mult);
		obj2.display(divd);
		
		
	}

}
