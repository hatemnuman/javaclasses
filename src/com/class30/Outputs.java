package com.class30;

public interface Outputs {
	
	public void display (double result);

}

interface Functions extends Outputs{
	
	public double adding(double firstNumber, double secondNumber);
	public double subtracting(double firstNumber, double secondNumber);
	public double multiply(double firstNumber, double secondNumber);
	public double dividing(double firstNumber, double secondNumber);
	
	
}
