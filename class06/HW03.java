package com.syntax.class06;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create calculator
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		System.out.println(" Please enter +,-,* or /");
		
		String operator=input.next();
		
		double num=0;
		
		if (operator.equals("+")) {
			System.out.println("Your result = "+ (num=num1+num2));
		}else if (operator.equals("-")) {
			System.out.println("Your result = "+ (num=num1-num2));
		}else if (operator.equals("*")) {
			System.out.println("Your result = "+ (num=num1*num2));
		}else if (operator.equals("/")) {
		System.out.println("Your result = "+ (num=num1/num2));

		}
	}
}


