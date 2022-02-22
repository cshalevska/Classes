package com.syntax.class05;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Ask the user to enter a nnumber
		// Small 1-10
		// Med 11-100
		// Large 101-1000
		
		Scanner number=new Scanner(System.in);
		
		System.out.println(" Please enter number");
		
		double num=number.nextDouble();
		
		if ( num<=10) {
			System.out.println("The number is "+num+" small");
		}else if( num>=10 && num<=100) {
			System.out.println("The number is "+num+" medium");
		}else if (num>=101 || num>=1000) {
			System.out.println("The num is "+num+" high");
		}else {
			System.out.println(" The number entry is invalid");
		}
	}

}
