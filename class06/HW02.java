package com.syntax.class06;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * input grade (A,B,C etc)
 * 
 */
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your grade");
		
		char grade=input.next().charAt(0);
		String explanation;
		
		switch(grade) {
		
		case 'A':
			explanation= "Excellent";
			break;
		case 'B' :
			explanation="Good";
			break;
		case 'C':
			explanation="Avarage";
			break;
		case 'D':
			explanation="Bad";
			break;
			
			default:
				explanation="Not Acceptable";
				
		}
		
		System.out.println("Your grade "+grade+" is "+explanation);
		}
	}
