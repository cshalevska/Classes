package com.syntax.homework;

import java.util.Scanner;

public class Replit32 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int n1=in.nextInt();
		  if(n1%2==0){
		    System.out.println("Value is even");
		    if ( n1>1000) {
		    	System.out.println("Even value is large");
		    }else if (n1%2!=0) {
		    	System.out.println("Value is odd");
		    	if (n1>1000) {
		    		System.out.println("Odd value is larger");
		    	}else {
		    		System.out.println(" Odd value is right");
		    	}
		    }
		  }
	}
}
	

