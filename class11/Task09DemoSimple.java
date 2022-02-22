package com.syntax.class11;

import java.util.Arrays;
import java.util.Collections;

public class Task09DemoSimple {

	public static void main(String[] args) {
		
		
	int [] arr= { 10,20,90,50,70};
	Arrays.sort(arr);
	
	Collections.reverseOrder();
	System.out.println(Arrays.toString(arr));
	System.out.println(arr[arr.length-1]);
	System.out.println(arr[arr.length-2]);
}
}
