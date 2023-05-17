package hust.soict.cybersec.lab01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DaysOfMonth {
	static final List<String> monthNames = Arrays.asList(
		"Jan", "Feb", "Mar", "Apr", "May", "Jun",
		"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
	);
	static final int[] daysArray = {
		31, 28, 31, 30, 31, 30,
		31, 31, 30, 31, 30, 31,
	};

	public static int daysOfMonth(String month) {
		if (month == null) return 0;
		if (month.length() >= 3) {
			var trunc = month.substring(0, 3);
			var index = monthNames.indexOf(trunc);
			if (index >= 0) return daysArray[index];
		}
		try {
			var monthNum = Integer.parseInt(month);
			return daysArray[monthNum - 1];
		}
		catch(Exception e) {}
		return 0;
	}
	public static boolean isValidYear(int year) { return year >= 0; }
	public static int parseYear(String year) {
		try {
			return Integer.parseInt(year);
		}
		catch(Exception e) {}
		return 0;
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) return true;
		if (year % 100 == 0) return false;
		if (year % 4 == 0) return true;
		return false;
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		int days = 0;
		while (days == 0) {
			System.out.print("Month? ");
			days = daysOfMonth(scanner.next());
		}
		int year = -1;
		while (!isValidYear(year)) {
			System.out.print("Year? ");
			year = parseYear(scanner.next());
		}

		scanner.close();

		if (days < 30 && isLeapYear(year)) days++;

		System.out.println(days);
	}
}
