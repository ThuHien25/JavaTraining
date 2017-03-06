package JavaUtil;

import java.util.Calendar;

/**
 * @author ThuHien. Demo java.util.Calendar
 */

public class CalendarDemo {

	// get the value of all the calendar date fields and print.
	public static void showCalendar(Calendar c) {

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); // Trả về giá trị từ 0 - 11
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millis = c.get(Calendar.MILLISECOND);

		// print the results
		System.out.println(
				" " + year + "/" + (month + 1) + "/" + day + " " + hour + ":" + minute + ":" + second + " " + millis);
	}

	public static void main(String[] args) {

		// create a calendar
		Calendar calendar = Calendar.getInstance();

		// print the results
		System.out.print("The current date:");
		showCalendar(calendar);

		// add 20 days to the calendar
		calendar.add(Calendar.DATE, 20);
		System.out.print("20 days later: ");
		showCalendar(calendar);

		// subtract 2 months from the calendar
		calendar.add(Calendar.MONTH, -2);
		System.out.print("2 months ago: ");
		showCalendar(calendar);

		// subtract 5 year from the calendar
		calendar.add(Calendar.YEAR, -5);
		System.out.print("5 years ago: ");
		showCalendar(calendar);
	}
}
