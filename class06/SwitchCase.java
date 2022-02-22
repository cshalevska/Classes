package com.syntax.class06;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=7;
		
		String dayName;
		
		if (day==1) {
			dayName="Monday";
		}else if (day==2) {
		dayName="Tuesday";
	}else if (day==3) {
	dayName="Wednesday";
}else if (day==4) {
dayName="Thursday";
}else if (day==5) {
dayName="Friday";
}else if (day==6) {
dayName="Saturday";
}else if(day==7) {
	dayName="sunday";
}else {
	dayName="invalid";
}
System.out.println(dayName);
		
		System.out.println("------------------");
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wenesday";
			break;
		case 4:
			dayName="Thursday";
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="Invalid";
				break;
		}
				System.out.println(dayName);
}
}
