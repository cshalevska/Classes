package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
	
		String day=input.next();
	
				if (day.equalsIgnoreCase("Saturday") ||  day.equals("Sunday")) {
					System.out.println("Today you will be learning Java");
				}else	if (day.equalsIgnoreCase("Tuesday")|| day.equals("Thursday")|| day.equals("Monday"))
					System.out.println("Today you will be learning manual testing");
			}
			
}
