package JavaUtil;

import java.util.Date;

/**
 * @author ThuHien. Demo java.util.Date
 */

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// create two dates
		Date date1 = new Date(98, 4, 21);
		Date date2 = new Date(99, 0, 9);

		// print two dates
		System.out.println("Date 1: " + date1.toString());
		System.out.println("Date 2: " + date2.toString());
		
		// make 3 comparisons with them
		int comparison1 = date1.compareTo(date2);
		int comparison2 = date2.compareTo(date1);
		int comparison3 = date1.compareTo(date1);

		// print the results
		System.out.println("-------Comparison Result-------");
		System.out.println("date 1 < date 2: " + comparison1);
		System.out.println("date 1 > date 2: " + comparison2);
		System.out.println("date 1 = date 1: " + comparison3);
		System.out.println("-------------------------------");
		
		// tests if date2 is after date1 and print
		boolean after = date2.after(date1);
		System.out.println("Date 2 after date 1? " + after);

		// tests if date2 is before date1 and print
		boolean before = date2.before(date1);
		System.out.println("Date 2 before date 1? " + before);
	}
}
