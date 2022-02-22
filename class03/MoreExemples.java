package com.syntax.class03;

public class MoreExemples {

	public static void main(String[] args) {
		/*
		 * we need to declare a boolean varable hungry yes or no
		 *
		 * if we are hungry---> I am going to eat Otherwise, ---> I am going to drink
		 * coffee
		 */
		boolean hungry = false;
		if (hungry == true) {
			System.out.println("I am going to eat");
		} else {
			System.out.println("I am going to drink coffee");
		}
		
		boolean traffic=false;
		
		if(traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("No traffic, I am on time");
		}
		
		/*
		 * define a variable to store browser
		 * 
		 * if browser is chrome ---> we are executing test on chrome
		 * otherwise-->i am not executing any test cases
		 */
		
		String browser="chrome";
		
		if (browser.equals("chrome")){
			System.out.println("we are executing any test chrome");
			
		}else {
			System.out.println("We are not executing any test cases");
			// would work in this example but not prefferable
			
			if (browser=="chrome") {
				System.out.println("We are executing test on chrome");
			}else {
				System.out.println("We are not executing any test cases");
			}
			}
		
		
     	}

}
