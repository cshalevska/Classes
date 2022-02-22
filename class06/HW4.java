package com.syntax.class06;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num=0;
		System.out.println(" Please enter +,-,* or /");
		
		String operator=input.next();
		
		switch(operator) {
		
			case "+":
			num=num1+num2;
			break;
			case "-":
			num=num1-num2;
			break;
			case "*":
			num=num1*num2;
			break;
			case "/":
		num=num1/num2;
		break;
	}
	System.out.println("Your result is ="+num);
	}

}
