package com.syntax.review04;

public class IfElseDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;

		if (number == 10) {
			System.out.println("Number is 10");
		}
		if (number == 15) {
			System.out.println("Number is 15");
		}if (number==20) {
			System.out.println("Number is 20");
		}
	// best practice to wrritte if condition 
		if (number == 10) {
			System.out.println("Number is 10");

		} else if (number == 15) {
			System.out.println("Number is 15");
		} else if (number == 20) {
			System.out.println("Number is 20");
		}
		
	}

}
