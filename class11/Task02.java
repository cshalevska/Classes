package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Creat a 2D array of int values. Print the sum of all number
		int[][] array2D = { { 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30 } };

		int sum = 0;
		for (int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		System.out.println("*************************");
			for (int x = 0; x < array2D.length; x++) {
				System.out.println(Arrays.toString(array2D[x]));
				for (int y = 0; y < array2D[x].length; y++) {
					sum = sum + array2D[x][y];
				}
			}

		System.out.println("Sum of the Array elements is " + sum);

	}

}
