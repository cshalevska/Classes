package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please ener the day");
		
       String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
			System.out.println("We have Java class");

	}else  if(day.equalsIgnoreCase("Tuesday")|| day.equals("Wenesday")){
	
		System.out.println("We have Manual class");
	}else if (day.equalsIgnoreCase("Thursday")){
		System.out.println("There is review class");
	
	}else {
		System.out.println("Invalid Entry");
	}
	}
}
