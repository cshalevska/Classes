package com.syntax.review04;

public class SwitchStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Sunday";

		if ("Monday".equals(day)) {
			System.out.println("It is Monday");
		}else if("Tuesday".equals(day)) {
			System.out.println("It is Tuesday");
		}else if("Wednesday".equals(day)) {
			System.out.println("It is Wednesday");
		}else if("Thursday".equals(day)) {
			System.out.println("It is Thursday");
		}else if("Friday".equals(day)) {
			System.out.println("It is Friday");
		}else if("Saturday".equals(day)) {
			System.out.println("It is Saturday");
		}else if("Sunday".equals(day)) {
			System.out.println("It is Sunday");
		}

/*		int number = 10;
		if (10 == number) {
		}
		if (number == 10) {
*/
		
		String day1 = "Sunday";
		if ("Monday".equals(day)) {
			System.out.println("Its Monday");
		}else if("Tuesday".equals(day)) {
			System.out.println("Its Tuesday");
		}else if("Wednesday".equals(day)) {
			System.out.println("Its Wednesday");
		}else if("Thursday".equals(day)) {
			System.out.println("Its Thursday");
		}else if("Friday".equals(day)) {
			System.out.println("Its Friday");
		}else if("Saturday".equals(day)) {
			System.out.println("Its Saturday");
		}else if("Sunday".equals(day)) {
			System.out.println("Its Sunday");
		}
		
		//Where possible always go for switch statements
		
		  switch (day) {
          case "Monday":
              System.out.println("Its Monday");
              break;
          case "Tuesday":
              System.out.println("Its Tuesday");
              break;
          case "Wednesday":
              System.out.println("Its Wednesday");
              break;
          case "Thursday":
              System.out.println("Its Thursday");
              break;
          case "Friday":
              System.out.println("Its Friday");
              break;
          case "Saturday":
              System.out.println("Its Saturday");
              break;
          case "Sunday":
              System.out.println("Its Sunday");
              break;
      }
		}
	}
