package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Capturing values using next");
	
	int temp=scan.nextInt();
	System.out.println(temp);
	
	scan.nextLine();
	
	System.out.println("Please enter the city");

	String anotherValue=scan.nextLine();
	System.out.println(anotherValue);
	
System.out.println("End of the program");
}
}