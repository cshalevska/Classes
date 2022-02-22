package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

	
		boolean understandJava=false;
		boolean likeJava=false;
		
	if(likeJava) {
			if (likeJava  || understandJava)
			System.out.println("Awesome! Keep up!");
		}else {
			System.out.println("Try to practice");
		}
	
	// we want to compare 3 numbers
	
	/*
	 * if num1 > num2 && num1>num3 ----> num1 is the largest
	 * what if  num2 > num1   &&  num2>num3 ----> num2 is the largest
	 * what if ( else if) num3 >num1  && num3>num2 ---> nam3 is the largest
	 * 
	*/
	
	
	int num1=100;
	int num2=2000;
	int num3=300;
	
	if(num1 > num2 && num1>num3 ) {
		System.out.println(num1+"  The number is ");
	}else if (num2 > num1   &&  num2>num3) {
		System.out.println(num2+" is larger ");
	}else if (num3 >num1  && num3>num2 )
		System.out.println(num3+" its larger than num2");
     

	
		System.out.println("End of the code");
	
}
}
	
	
	
	