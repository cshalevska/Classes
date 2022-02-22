package com.syntax.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ask user to enter their country 
 * pirnt what languages they speak
 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Where are you from");
		
		String country=input.next();
		String language=input.nextLine();
		switch(country.toLowerCase()) {
		
		case "usa":
		language= "english";
		break;
		
		case "macedonia":
			language = "macedonian";
			break;
		case " russia":
			language= "russian";
			break;
			
		case "japan":
			language="japanese";
			break;
			
		case "serbia":
			language="serbian";
			break;
			default:
				language="unknown";
				
		}
		input.close();
		System.out.println("In "+country+ " people speak "+language);
		
		}
}
	
