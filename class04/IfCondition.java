package com.syntax.class04;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		//Step 1: create a scanner and assign it to a variable	
				Scanner scan=new Scanner(System.in);
				
				//Step 2: specify instructions
				System.out.println("Please enter country where you are from");
				
				//Step 3: we need to capture String val-> use next();
				String country=scan.next();
				System.out.println("You are from "+country);
				
				//if you are from USA->you speak English
				//				France->you speak Franch
				
				if(country.equalsIgnoreCase("USA")) {
					System.out.println("You speak English");
				} else if(country.equalsIgnoreCase("France")) {
					System.out.println("You speak Franch");
				} else if(country.equalsIgnoreCase("Turkey")) {
					System.out.println("You speak Turkisha");
				} else {
					System.out.println("I don`t know which language you speak");
				}
	}
}