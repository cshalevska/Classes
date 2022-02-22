package com.syntax.review04;

import java.util.Scanner;

public class CommonIssues {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		   System.out.println("Please enter your score");

		   int score=scan.nextInt();
		char grade='A';

		if (score>=1 && score<=25){
		grade='F';
		}else if (score>25 && score<=45){
		  grade='E';
		}else if(score>50 && score<=60){
		  grade='C';
		}else if (score>60 && score<=80){
		  grade='B';
		}else if (score<80){
		  System.out.println("Please enter valid mark");
		}
		 
		 System.out.println("Your grade is "+grade);
		
		}
		
	}


