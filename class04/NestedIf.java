package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// if inside another if 
		
		boolean vaccine=true;
				int dose=2;
		
		if(vaccine) {
			System.out.println("How many doeses you have?");
			if(dose==1){
				System.out.println("You need anothe shot");
			}else {
				System.out.println(" You are fully vaccinated");
			}	
		
	}

	}
}

