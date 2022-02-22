package com.syntax.class04;

public class NestedIf01 {

	public static void main(String[] args) {
		//nested if---> always has a dependency on outher if
		// outter is MUST to be true in order for nested if to be checked 

		boolean allergy = false;
		if (allergy) {
			System.out.println("Let me check what allergies you have");

			String allergyType = "pollen";

			if (allergyType.equals("pllen")) {
				System.out.println(" Please stay at home when threes are blooming.Take med A");
			} else if (allergyType.equals("penute")) {
				System.out.println("Plese do not eat food that contains nuts. Take med B");

			} else if (allergyType.equals("gluten")) {
				System.out.println(" Please follow gluten free diet. Take med c");

			} else {
				System.out.println("I don't which suggestion to give you");
			}
		} else {
			System.out.println("You are lucky");
		}
	}

}
