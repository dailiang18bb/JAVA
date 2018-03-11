package introduction.Java_12_DateAndTime;

import java.util.Calendar;
import java.util.Scanner;

public class Solution {
	public static String getDay(String day, String month, String year) {

		/*
		 * Write your code here.
		 */

		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
		int a = cal.get(Calendar.DAY_OF_WEEK);
		String[] weeks = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		return weeks[a - 1];
		/*
		 * 
		 * end my code
		 * 
		 * MONTH 
		 * public static final int MONTH Field number for get and set indicating
		 * the month. This is a calendar-specific value. The first month of the year in
		 * the Gregorian and Julian calendars is JANUARY which is 0; the last depends on
		 * the number of months in a year.
		 * 
		 */
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}