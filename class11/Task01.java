package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array on int value using a scanner and cal
		 * the sum of all stored elements in that array
		 * 
		 */
// pseudo prorgamming 
		// take the size of the array  using scanner class from the user
		// creat an int array of above size
		// fill the array with elements from the using scanner
		// sam all the elements of the array
		//a class that helps use the input from the keyborde
		
		Scanner scan=new Scanner (System.in);
		//promt the user for the size
		System.out.println("Please Enter the size of the array");
		//take the size from the user and store in the size varable
		int size=scan.nextInt();
		//print out the size
		System.out.println("The size of the array " +size);
		// create an int array of aboce size
		
		int[] array=new int[size]; // all lower case, or cammel case
		     //fill the array with elements from the user using scanner
		System.out.println("Please enter "+size+" elements");
		for ( int i=0; i<size;i++) {
		System.out.println("Please eneter the elements for index "+i);
		array [i]=scan.nextInt();
		}
		//print out the elements of an array without a loop
		System.out.println(Arrays.toString(array));
		// sum all the elements of the area
		int sum=0;
		
		for( int x=0; x<size;x++) {
			sum=sum+array[x];
		}
		System.out.println("Sum of the Array elements is "+sum);
	}

}
