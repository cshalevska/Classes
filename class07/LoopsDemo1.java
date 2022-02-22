package com.syntax.class07;

public class LoopsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/// Print only even number from 1 to 30\
		
		//Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 5};   
        int sum = 0;  
          
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {   
           sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  