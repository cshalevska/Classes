package com.syntax.class11;

public class Task04 {
	public static void main(String[] args) {
        //check the if element is even if is add it to sumEven var
		// ckeck if element is odd
	   // print the values of both variables
		
		int[][] array2D = { { 2, 3, 4 }, { 5, 6 }, { 12, 6, 8 } };

		int sumEven=0;
		int sumOdd=0;
		for (int x = 0; x < array2D.length; x++) {

			for (int y = 0; y < array2D[x].length; y++) {
				int elements = array2D[x][y];
				if (elements % 2 == 0) {
					sumEven+=elements;
					
				}else {
					sumOdd+=elements;
				}
			}
		}
				System.out.println(" Sum The Even numbers  "+sumEven);
				System.out.println(" Sum The Even numbers  "+sumOdd);
			}
			
		}

	
