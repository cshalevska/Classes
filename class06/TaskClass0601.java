package com.syntax.class06;

import java.util.Scanner;

public class TaskClass0601 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the country");
		String country=input.next();
				
		String language;
		
		switch(country.toUpperCase()) {
		
		case "USA":
			language="English";
			break;
		case "MEXICO":
			language="Spanish";
			break;
		case "MACEDONIA":
			language="Macedonian";
		break;
		
		case "JAPAN":
			language="Japanise";
			break;
			default:
				language="Unknown";
				
		}
		input.close();
				System.out.println("In " +country+" people speak "+language);
		}

	}


