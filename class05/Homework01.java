package com.syntax.class05;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please eneter your hight in inchese");
		
		int hight=scan.nextInt();
		
		if (hight<60) {
			System.out.println("You are short person");
		}
		else if ( hight<=60 || hight <=70) {
			System.out.println("You are medium person");
		}
		else if ( hight >72) {
			System.out.println("You are tall");
			
		}
		
	}

}
