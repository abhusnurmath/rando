package cit590;

public class JavaExample {

	public static void main(String[] args) {
		int start = 1990;
		int end = 2015;
		int year = start;
		boolean isLeapYear;

		while (year <= end) {
			isLeapYear = year % 4 == 0; // a leap year is a year divisible by
										// 4...
			if (isLeapYear && year % 100 == 0) { // ...but not by 100...
				if (year % 400 == 0)
					isLeapYear = true; // ...unless it’s also divisible by 400
				else
					isLeapYear = false;
			}
			if (isLeapYear) {
				System.out.println(year + " is a leap year.");
			}
			year = year + 1;
		}
	}

}
