package com.syntax.review05;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String month="Feb";
		int day=2;
		
		if ("Jan".equals(month)) {
			if(day==1) {
			System.out.println("It is the first of Jan");
		}else {
			
			System.out.println("It is Jan but not first of Jan");
		}
		}else {
			System.out.println("It is not Jan");
		}
		
	}

}
