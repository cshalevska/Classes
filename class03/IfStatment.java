package com.syntax.class03;

public class IfStatment {

	public static void main(String[] args) {
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 * 
		 * 
		 */
		int num1 = 100;
		int num2 = 50;

		if (num1 < num2) {
			System.out.println(num1 + " is larger than " + num2);
		}

		double money = 5;
		double coffee = 5;

		// if I have more money that a price of the coffee---> I am buying a coffeee

		if (money > coffee) {

			System.out.println(" I will buy the coffee");

		}

		if (money > coffee) {

			System.out.println("I will not buy coffee:(");
		}
	}

}
