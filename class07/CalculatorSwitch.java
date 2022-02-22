package com.syntax.class07;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		char operator;
		Scanner sc;
		
		
		sc = new  Scanner (System.in);
		System.out.println("Plese enter the first number");
num1=sc.nextInt();

System.out.println("Please enter the secound number");
num2=sc.nextInt();

System.out.println("Please enter the operator");		
operator= sc.next().charAt(0);	

int result=0;

switch (operator) {

case'+':
	result=num1+num2;
	break;
case '-':
	result=num1-num2;
	break;
	
case '*':
	result=num1*num2;
	break;
	
case '/':
	if( num2!=0) {
		result=num1/num2;
	}else { 
		System.out.println(" We can not devide by "+num2);
	}
	break;
	
	default:
		System.out.println("Invalid Operators");

}
System.out.println(result);
	}

}


