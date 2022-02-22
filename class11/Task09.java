package com.syntax.class11;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= { 10,20,90,50,70};
		int largest= Integer.MIN_VALUE;
		int secoundLargest=Integer.MIN_VALUE;
		int theLargest=Integer.MAX_VALUE;
		
		for( int elements:arr) {
			
			if (elements>largest) {
				secoundLargest=largest;
				largest=elements;
				theLargest=elements;
			}
			
		
			}
		System.out.println(" The secoundLargest is "+secoundLargest);
		System.out.println(" The largest is "+theLargest);
		}
	
}
