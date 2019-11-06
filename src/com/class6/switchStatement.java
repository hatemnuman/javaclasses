package com.class6;

public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =2;
		String weekday="";

		if (day == 1) {
			weekday = "Monday";
		} else if (day == 2) {
			weekday = "Tuesday";
		} else if (day == 3) {
			weekday = "Wensday";
		} else if (day == 4) {
			weekday = "Thursday";
		} else if (day == 5) {
			weekday = "Friday";
		}else {
			System.out.println("INValid");
		}
		
		System.out.println(weekday);
		
		day=5;
		
		switch (day){
		case 1:
			weekday="Monday";
			break;
		case 2:
			weekday="Tusday";
			break;
		case 3:
			weekday="Wensday";
			break;
		case 4:
			weekday="Thursday";
			break;
		case 5:
			weekday="Friday";
			break;
			default :
				weekday="invalid";			
			
		}System.out.println(weekday);

		
	}
}
