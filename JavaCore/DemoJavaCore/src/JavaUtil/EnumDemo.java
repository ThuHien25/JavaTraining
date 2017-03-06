package JavaUtil;

/**
 * @author ThuHien. Demo java.util.Calendar
 */

public class EnumDemo {

	// This enum defines the constants is the day of the week.
	public enum WeekDay {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	/*
	 * Parameter passed in the days of the week. 
	 * Returns the name of the job will do.
	*/
	public static String getJob(WeekDay weekDay) {
		if (weekDay == WeekDay.SATURDAY || weekDay == WeekDay.SUNDAY) {
			return "Nothing";
		}
		return "Coding";
	}

	public static void main(String[] args) {
		
		System.out.println("Monday job: " + getJob(WeekDay.MONDAY));
		System.out.println("Sunday job: " + getJob(WeekDay.SUNDAY));
		
		WeekDay today = WeekDay.MONDAY;
		
		// Use "=="  to compare two elements of the Enum.
		if (today == WeekDay.MONDAY) {
            System.out.println("Today is " + today);
        }
	}
}
