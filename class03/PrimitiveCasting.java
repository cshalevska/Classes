package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	//main+ctr+space
	// ctr+space --->autocomplete
		
		int i=10;
		
	//widing or implicit
		//we store int value 10 inside double veriables
		double d=10.99;
		System.out.println(i);//10
		System.out.println(d);//10.0

		//int num=10.00; //type mismatch;cannot convert from double to int
		
		//narrowing or explicit casting 
		//we store double value 10.99 into int varable
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f; // type mismatch, cannot convert from double to float
		
		byte b=(byte)1000;
		System.out.println(b);
		
		long numb=11568768768l;
		
		int numb1=(int)11568768768l;
		System.out.println(numb1);
		
		
	}

}
