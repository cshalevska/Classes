package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a day:");
		String day=scan.nextLine();
		
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
			System.out.println("We don't have a class");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equals("Wenesday")) {
			System.out.println("We have Manual class");
			
		}else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println(" We have Review class");
		}else if(day.equalsIgnoreCase("Saturday") || day.equals("Sunday")){
			System.out.println("We have Java class");
		}else {
			System.out.println("Invalid Entry");
		}
		
	}

}
