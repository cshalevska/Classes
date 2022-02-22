package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean value=!false;
		
		System.out.println(value);
		
	System.out.println("------------------");
	
	
	boolean traffic=false;
	
	if(!traffic) {
		System.out.println("I will come on time to work");
	}
	
	String day="Sunday";
	
	if (!day.equals("Saturday")) {
		System.out.println("Today is not Saturday");
	}
	System.out.println("------------------------------");
	boolean checkboxChecked=false;
	
	
	if (!checkboxChecked) {
		System.out.println("I will clik on the checkbox");
	}
	System.out.println("------------The End----------");
	}

}
