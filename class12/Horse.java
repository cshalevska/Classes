package com.syntax.class12;

public class Horse {
// attribudets, firelds, properties 
	String name;
	String breed;
	int age;
	double weight;
	// bahavors, methods, functions
	void run() {
		System.out.println(name+" is running");
	}
	void eat() {
		System.out.println(name+ " is eating");
	} 
	
	void printCompleteInfo() {
		System.out.println("name ="+name);
		System.out.println("breed= "+breed);
		System.out.println("age="+age);
		System.out.println("weight="+weight);
	}
	public static void main(String[] args) {
		
		Horse ceceHorse=new Horse();
		ceceHorse.name="spirit";
		ceceHorse.breed="stallion";
		ceceHorse.age=20;
		ceceHorse.weight=400;
		ceceHorse.run();
		
		ceceHorse.printCompleteInfo();
		
		System.out.println("******************");
		Horse mrAsHourse=new Horse();
		mrAsHourse.name="Tuzik";
		mrAsHourse.breed="Mustang";
		mrAsHourse.age=15;
		mrAsHourse.weight=450;
		mrAsHourse.run();
		mrAsHourse.printCompleteInfo();
	}
}
