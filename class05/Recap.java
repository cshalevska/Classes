package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//String name
		
Scanner input=new Scanner(System.in);
System.out.println("Please enter your name");

//String name="Cece";
String name=input.next();
System.out.println(" Please enetr you age");

int age= input.nextInt();
System.out.println(" Your name is "+name+" and your age "+age);
System.out.println("*********************");
System.out.println("Please enter boolean value");

boolean booleanValue=input.nextBoolean();
System.out.println(booleanValue);

System.out.println("Please enter decima value");

double d=input.nextDouble();
System.out.println(d);

System.out.println("Please enter char value ");

 char character=input.next().charAt(64);

System.out.println(character);
	}

}
