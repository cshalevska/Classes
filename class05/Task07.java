package com.syntax.class05;

public class Task07 {

	public static void main(String[] args) {
		// fibonacci series 0 1 1 2 3 5 8 13 21 34
		// store the number of Fabonacci numbers that we want to produce
		// start from zero to one
	// add the previous number to procde then next number
		//chek if we have printed the reqired number or not
		
		int howMany=30;
		int previous=0;
		int current=1;
		
		int next=0;
		System.out.print(previous+" ");
		System.out.print(current+" ");
		for ( int i=0; i< howMany-2;i++) {
		next=previous+current;
		System.out.print(next+" ");
		previous=current;
		current=next;
	}
		

	}

}
