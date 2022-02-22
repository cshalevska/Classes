package com.syntax.class07;

import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int secretNumber=12;
		Scanner scan= new Scanner(System.in);
		
		int guessNumber;
		
		do {
			System.out.println(" Please enter a number to win");
			guessNumber=scan.nextInt();
			
		}while ( guessNumber!=secretNumber);
		
		System.out.println("Congratulation");
		
	}

}
