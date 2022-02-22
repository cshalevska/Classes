package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * 	Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 50000 than user will take a loan, 
		 * otherwise user will pay cash.
		 */

		double morgageRate=3.00;
		int morgagePrice=1450000;
		
		if (morgageRate>4.5) {
			System.out.println("You will not buy a house");
		}else {
			
			System.out.println("You can buy a house");
			if ( morgagePrice>500000) {
				System.out.println("You should take a loan");
			}else {
				System.out.println("You can pay in cash");
			}
		}
	}

}
