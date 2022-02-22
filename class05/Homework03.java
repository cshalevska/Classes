package com.syntax.class05;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		
		String city=input.nextLine();
		
		System.out.println("Please enter your temperture");
		
		int faranheight, celesius;
		
		faranheight=input.nextInt();
		celesius=((faranheight-32)*5)/9;
		
		System.out.println("The temperature in "+city+" is "+ celesius+" Celesius");
		 
		
		
		
	}

}
