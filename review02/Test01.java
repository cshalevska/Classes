package com.syntax.review02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	 
	    if(num > 0)
        {
            System.out.println(num+" is positive number");
        }
        else if(num < 0)
        {
            System.out.println(num+" is negative number");
        }
        else
        {
            System.out.println(num+" is neither positive nor negative");
        }
    }
}
		
		
	
	

