package com.syntax.class11;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= { 10,20,90,50,70};
		int largest=arr[0];
		// assuming the first one is largest
		int smallest=arr [0];
		// assuming the secound one is the smallest
		
		// intergrate thru all the elements
		for( int elements:arr) {
			if (elements>largest) {
				largest=elements;
			}
			//checking if we have something even smaller if yes update the smalles
			if (elements<smallest) {
				smallest=elements;
			}
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Smallest number is "+smallest);
	
		}

	}
