package com.syntax.class12;

public class DogBreed {

	// attributes,fields,properties;
	
	String name;
	String color;
	String breed;
	int age;
	double weight;
	
	//bahaviors, function and methods
	
	void play () {
		System.out.println(name+" the dog is playful");
		
	}
	void train() {
		System.out.println(" Dog is the beast");
	}
	void sleep() {
		
	System.out.println(" Dog is sleeping ");
		
	}
	void printCompleteInfo() {
			System.out.println("name ="+name);
			System.out.println("breed= "+breed);
			System.out.println("color="+ color);
			System.out.println("age="+age);
			System.out.println("weight="+weight);
	}
	public static void main (String[ ]args) {
		DogBreed Dog1=new DogBreed();
		Dog1.name="Bella";
		Dog1.breed="Husky";
		Dog1.color="white";
		Dog1.age=3;
		Dog1.weight=100;
		Dog1.play();
		
		Dog1.printCompleteInfo();
		
		System.out.println("******************");
	
		DogBreed Dog11=new DogBreed();
		Dog11.name="Shark";
		Dog11.breed="Bulldog";
		Dog11.color="brown";
		Dog11.age=7;
		Dog11.weight=120;
		Dog11.train();
		
		Dog11.printCompleteInfo();
		
		System.out.println("******************");
		DogBreed Dog2=new DogBreed();
		Dog2.name="Rex";
		Dog2.breed="Labrador";
		Dog2.color="gray";
		Dog2.age=1;
		Dog2.weight=60;
		Dog2.sleep();
		
		Dog2.printCompleteInfo();
		
		System.out.println("******************");
}
}
