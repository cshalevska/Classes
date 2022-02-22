package com.syntax.class12;

public class Phone {
	// attribudets, firelds, properties 
		String smartphone;
		String model;
		double price;
		int memory;
		// bahavors, methods, functions
		
		void makeCalls() {
			System.out.println(smartphone+" is my phone");
		}
		void takePicture() {
			System.out.println(smartphone+" "+model+ " is the newest phone");
		} 
		
		void printCompleteInfo() {
			System.out.println("smartphone ="+smartphone);
			System.out.println("model= "+model);
			System.out.println("price="+ price);
			System.out.println("memory="+memory);
		}
		public static void main(String[] args) {
			
		  Phone myPhone=new Phone();
			myPhone.smartphone="Iphone";
			myPhone.model="13 Max Pro";
			myPhone.price=1099.99;
			myPhone.memory=512;
			myPhone.makeCalls();
			
			myPhone.printCompleteInfo();
			System.out.println("*************************");
			
			Phone myPhone1=new Phone();
			myPhone1.smartphone="Google Pixel";
			myPhone1.model="6";
			myPhone1.price=899;
			myPhone1.memory=125;
			myPhone1.takePicture();
			
			myPhone.printCompleteInfo();
			System.out.println("*************************");
			Phone myPhone2=new Phone();
			myPhone2.smartphone="Nokia";
			myPhone2.model="X100";
			myPhone2.price=499.99;
			myPhone2.memory=128;
			myPhone2.makeCalls();
			
			myPhone2.printCompleteInfo();
}
}
