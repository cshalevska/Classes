package com.syntax.class11;

import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		// create 2D array 
		//store Even and ODD number
		int[][] array2D = { { 2, 3, 4 }, { 5, 6 }, { 12,6, 8 } };

		for (int x = 0; x < array2D.length; x++) {
	
			for (int y = 0; y < array2D[x].length; y++) {
			int elements =array2D[x][y];
			if(elements%2==0) {
				System.out.println(elements);
			}
			}
	}

}
}