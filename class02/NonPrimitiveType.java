package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		
		String name="Cece";

		String lastName="Shalevska";
		long phoneNumber=5712457901l;
		
		String mobileNumber="571-245-7901";
		
		String num="123";
		int num1=123;
		
		String greeting="Hello Friends!";
		
		System.out.println(greeting);
		System.out.println(name);
		System.out.println(lastName);
	System.out.println(name+" "+ lastName);
	
	/*
	 * using+ we can concatenate
	 * String++String
	 * String+int
	 * String+boolean
	 * String+double,char etc..
	 */
	 
	int age=32;
	
	// Cece is 32 years old 
	
	System.out.println(name+ " is "+age+ " years old");
	
	String address="123 Test Street";
	
	System.out.println("I live on"+address);
	String feeling="like";
	String food="kebab";
	
	System.out.println("I " + feeling+" "+ food );
	
	feeling="love";
	food="Shrimp";
	
	System.out.println("I "+feeling+" "+food);
	}

}
