package com.syntax.class05;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Please enter a day:"); 
		
	String day=scan.nextLine();
	
	if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wenesday") ||day.equals("Thursday") || day.equals("Friday")) {
		System.out.println("It is a weekeday");
	}else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("It is invalid entry");
	}
	}

}
