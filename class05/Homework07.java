package com.syntax.class05;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*if hours between 1-11 ---> Morning
		 * if hours 12-15 ---> Afternoon
		 * if hour 16-20 ---> Evening
		 * if hours 20-24 ---> Night
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the current time:");
		
		int num=input.nextInt();
		
		if ( num>=1 && num<=11) {
			System.out.println(" It's Morning");
			
		}else if ( num>=12 && num<=15) {
			System.out.println("It is Afternoon");
		} else if(num>=16 && num<=20 ) {
			System.out.println("It is a Evening");
		}else if( num>=20 && num<=24) {
			System.out.println("It is Night");
	}else {
		System.out.println("Invalid entry");
	}

}
}