package com.syntax.class04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class UserInput {

	public static void main(String[] args) {
		int num=10;
		num=20;

		
		Scanner input=new Scanner (System.in);//create a scanner 
		System.out.println("Please enter your name ");
		
		String name=input.next();
		System.out.println("Your name is "+name);
		
		// if you want to capture int--> use nextInt();
		
		System.out.println(name+" please eneter your age");
		
		int age=input.nextInt();
		
		System.out.println("your name "+name+" and your age is "+age);
	}

}
