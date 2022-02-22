package com.syntax.class05;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.println("Do you have credit card?Please answer yes or now");
		
		String card=input.next();
		
		if (card.equalsIgnoreCase("yes")){
		System.out.println("What is the balance of your credit card");
		
		double balance=input.nextDouble();
		
	if (balance >1000){
		System.out.println("Pay of the $"+balance+" immediatly");
		
	}else {
		System.out.println("You can spend more");
			
		}
		

	}else {
		System.out.println("Would you like to sign up for a credit card");
	}
}
}
