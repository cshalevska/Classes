package com.syntax.class07;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	System.out.println("Are you going shopping?");
		
		String sale=input.nextLine(); 
		
		if(sale.equalsIgnoreCase("no")) {
			System.out.println("You are not going for shopping");
			
		}else if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price for the itam");
			int actualPrice=input.nextInt();
			int discount=0;
			
			if (actualPrice< 20) {
				discount=10;
			}else if (actualPrice >=20 && actualPrice<=100) {
				discount=20;
			}else if(actualPrice >=100 && actualPrice<=500) {
				discount=30;
				
			}else {
				discount=50;
			}
				int saving=(actualPrice*discount)/100;
				int finalPrice=actualPrice-saving;
			
		
			System.out.println("After discount "+ discount+"% "+ "the price of the reduce item from $" +actualPrice+ " to $"+finalPrice);
		}
		
		}

}
