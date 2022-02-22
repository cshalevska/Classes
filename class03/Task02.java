package com.syntax.class03;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Double Comparison. Declare 2 double values
		 * and if value of first variable is higher then the second, print “Double value
		 * __ is larger than __ .” Otherwise print...
		 */

		int num1 = 30;
		int num2 = 50;

		if (num1 > num2) {
			System.out.println("Double values " + num1 + " is larger than " + num2);
		} else {
			System.out.println("Double values " + num2 + " is larger than " + num1);
		}
		/*
		 * Create a Java program and name it Temperature Check. Create variable to store
		 * temperature. Your program should check if temperature is below 32 then it
		 * should print “Water will freeze with temperature __“, otherwise “Water will
		 * NOT freeze with temperature __“.
		 */

		int temp = 29;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperture " + temp);
		}

		/*
		 * Create Java program to store 2 values for expected and actual hours. Your
		 * program should check if expected hours are more than actual the program
		 * should print “You will love the course and you will succeed”, otherwise
		 * “Course will be very hard for you!“.
		 */

		int expectedHours = 30;
		int actualHours = 40;

		if (expectedHours < actualHours) {
			System.out.println("The course will be hard for you ");
		} else {
			System.out.println("You will love the course");
		}
	}
}