package com.programming.example;

public class WeekDay {
	public static void main(String[] args) {
		WeekDay w = new WeekDay();
		System.out.println(w.WeekDayName(3));
	}

	public String WeekDayName(int n) {
		if (n == 1)
			return "Sunday";
		else if (n == 2)
			return "Monday";
		else if (n == 3)
			return "TuesDay";
		else if (n == 4)
			return "Wednesday";
		else if (n == 5)
			return "thursday";
		else if (n == 6)
			return "Friday";
		else if (n == 7)
			return "Saturday";
		else
			return "Input not valid";
	}
}
