package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

/*Create a Java program and name it Variables
*In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
*My name is ___ and my  last name is ____
*I am A/B student 
*I live in city__ and state____
*And my phone number is …..
*b)   Change student’s city, state, phone number and grade. And print those updated values:
*Example:
My name is __ and I moved to new city__ and new state__. My new phone number is ____
 
*/
		String name="Cece";
		String lastName="Shalevska";
		long phoneNumber=5712457901l;
		char grade='B'; 
		String mobileNumber="571-245-7901";
		
		
		
		String city="Alexandria";
		String country="Virginia";
		
		String greeting="Hello Friends!";
		
		System.out.println(greeting);
		System.out.println("My name is " + name + " " + "and my last name is " + lastName);
		System.out.println("I am an " + grade + " " + "student");
		System.out.println("I live in " + city + " and the state is " + country);
		System.out.println("My phone number is " + phoneNumber);
		System.out.println("My name is " + name + " " + lastName + " and I moved to new city " + city + " and a state of " + country + "." + " My new phone number is " + mobileNumber );
		
		
	}

}
