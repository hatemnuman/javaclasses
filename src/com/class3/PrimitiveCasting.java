package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=12;
		System.out.println(d);

		//int i=12.5; compil time erro.
		
		/* Casting - changing / converting one type to another 
		 * widening(imlicit / Automatic)
		 * 
		 * 
		 * byte--> sort--> int--> long-->float-->double)
		 * 
		 * Narrowing (Explicit / Manual)
		 * byte<-- sort<-- int<-- long<-- float<-- double
		 * 
		 */

		//widwing 
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		
		System.out.println(d1);
		
		//narrowing or explicit or manual casting
		
		double d2=123.56;
		int num2=(int)d2;
		
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		
		System.out.println(b1);
		
		
		//101000
	}
	

}
