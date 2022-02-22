package com.syntax.class02;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
*Write a program to find the square of the number 3.9. 
*You program should say “The square of the ____ is ____ ”
*Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
* Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
* */

		
		double num1=2.5;
		double num2=3.5;
		System.out.println("The addition of 2 number " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
		System.out.println("The subtraction of 2 number " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
		System.out.println("The multiplication of 2 number " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
		System.out.println("The divider of 2 number " + num1 + " and " + num2 + " is equal to " + (num1 / num2));
	
		System.out.println("************** TASK 2 **************");
	
		double num=3.9;
		double square= num*num;
		System.out.println("The square of the " + num + " is " + square);
		
		System.out.println("************ TASK 3 ****************");
		
		int width=5;
		int hight=8;
		int perimetar=(width+hight)*2;
		int area=width*hight; 
		
		System.out.println("The perimeter of a rectangle with width "  +width+ " and height of " + hight + " is equal to "+perimetar+ " and the area is "+area+".");
		System.out.println("The square of the " + num + " is " + square);
	}

}
