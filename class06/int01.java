package com.syntax.class06;

public class int01 {

	public static void main(String[] args) {

		int quizScore = 50;
		int midtersmsScore=70;
		int finalScore=85;
		
		int score=(quizScore+midtersmsScore+finalScore);
		char grade;
		if (score >=90) {
			grade='A';
		}else if(score >=70 && score<90) {
			grade='B';
			
		} else if (score >=50 && score <70) {
			grade='C';
			
		}else {
			grade='F';
			
			System.out.println("Your grade is"+grade);
		}

	}

}
