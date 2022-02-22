package com.syntax.class07;

import java.util.Scanner;

public class CaluclatorUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);

System.out.println("Please enter your first value");
int val1=scan.nextInt();
System.out.println("Please enter desired operation +,-,* or /");
char op=scan.next().charAt(0);
System.out.println("Please enter the secound value");
int val2=scan.nextInt();


int result = 0;

if(op=='+' ) {
	result=val1+val2;
}else if ( op=='-') {
	result=val1-val2;
}else if(op=='/') {
	result=val1/val2;
}else if ( op=='*') {
	result=val1*val2;
}else {
	System.out.println("Invalid entry");
}
System.out.println(result);
	}
	
}

