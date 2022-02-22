package com.syntax.class12;

public class Dog {

	
	// attributes,fields,properties;
	
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	//bahaviors, function and methods
	
	void bark () {
		System.out.println("Dog is barking ...");
		
	}
	void eat() {
		System.out.println(" Dog is eating");
	}
	void sleep() {
		
		System.out.println(" Dog is sleeping ");
	}
	public static void main (String[ ]args) {
		// creating an object scooby from class Dog
		// dog is a class
		// scooby is an object
		// =is an assigment operator
		// new is keyword that we use to create an object of class 
		//Scanner scan=ne scanner(System.in); 
		Dog scooby= new Dog();
		
		scooby.bark();
		scooby.eat();
		scooby.sleep();
	}
	
}
