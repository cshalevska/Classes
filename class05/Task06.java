package com.syntax.class05;

public class Task06 {

	public static void main(String[] args) {
		// Writte a java program to check whetever a given number is prime or not?

		int num=5;
		boolean isPrime=true;
		
		if (num>1) {
			for( int i=2; i<num;i++) {
				if(num%i==0);
				isPrime=false;
				break;
			}
		}else {
			isPrime=false;
		}
		System.out.println(num+ " isPrime "+isPrime);
	}

}
