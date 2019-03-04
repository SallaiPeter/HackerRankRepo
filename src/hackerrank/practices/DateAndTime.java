package hackerrank.practices;

import java.text.DateFormatSymbols;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

public class DateAndTime {

	private static LocalDate date;
	private static Calendar cal;
	private static LocalDateTime dateTime;
	private static LocalTime time;

	public static void main(String[] args) {

//		createDate();
//		getAndDisplayInfFromDefault();
//		currentTimeInNewYork();
//		getLastDayOfMonth();
//		getLastDateOfMonth();
		getFirstAndLastDaysOfWeeks();
		addSomeTime();

	}

	// 1. Write a Java program to create a Date object
	private static void createDate() {
		date = LocalDate.now();
		System.out.println(date);
	}

	// 2.Write a Java program to get and display information (year, month, day,
	// hour, minute) of a default calendar.
	private static void getAndDisplayInfFromDefault() {

		dateTime = LocalDateTime.now();
		System.out.println("Date and time:");
		System.out.println(dateTime.getYear());
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());

	}

	// 5.Write a Java program to get the current time in New York.
	private static void currentTimeInNewYork() {

//		cal = Calendar.getInstance();
//		cal.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
//		System.out.println(cal.getTimeZone());
//		System.out.println("Time in New York: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)
//				+ ":" + cal.get(Calendar.SECOND));

		dateTime = LocalDateTime.now();
		ZoneId id = ZoneId.of("America/New_York");
		ZonedDateTime newYork = ZonedDateTime.of(dateTime, id);
		System.out.println(newYork);
		Set<String> ids = ZoneId.getAvailableZoneIds();

		ZonedDateTime parsed = ZonedDateTime.parse("2013-03-22T13:22:12.523+01:00[Europe/Paris]");
		System.out.println("Parsed date: " + parsed);

		Period periodDays = Period.between(LocalDate.of(1986, 12, 06), LocalDate.now());
		System.out.println("Im " + periodDays + "days old.");
		long daysOld = ChronoUnit.DAYS.between(LocalDate.of(1986, 12, 06), LocalDate.now());
		long monthsOld = ChronoUnit.MONTHS.between(LocalDate.of(1986, 12, 06), LocalDate.now());
		System.out.println(daysOld + " days.");
		System.out.println(monthsOld + " months.");

		System.out.println("DateTime: " + dateTime);
		System.out.println("DateTime + 15 day: " + dateTime.plus(Period.ofDays(15)));

		LocalTime startTime = LocalTime.now();
		LocalTime finalTime = startTime.plus(Duration.ofMinutes(30));
		System.out.println(startTime + ", " + finalTime);
		System.out.println("Duration: " + Duration.between(startTime, finalTime));
		long mins = ChronoUnit.SECONDS.between(startTime, finalTime);
		System.out.println("With chrono: " + mins);
		dateTime.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));
		System.out.println("DateTime: " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm:ss")));
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

	}

	// 7. Write a Java program to get the last day of the current month.
	private static void getLastDayOfMonth() {

		cal = Calendar.getInstance();
		System.out.println("Last day of current month: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	// 8. Write a Java program to get the last date of the month.
	private static void getLastDateOfMonth() {

		System.out.println("Last day of month: " + date.withDayOfMonth(date.lengthOfMonth()));

	}

	// 12. Write a Java program to get localized day-in-week name.
	private static void getFirstAndLastDaysOfWeeks() {
		DateFormatSymbols symbol = new DateFormatSymbols(new Locale("hu"));
		String[] days = symbol.getWeekdays();
		for (String d : days) {
			System.out.println(d);
		}
	}
	
	private static void addSomeTime() {
		
		time = LocalTime.now();
		time.plus(Duration.ofHours(2));	
		date = LocalDate.now().plus(Period.ofWeeks(2));
		LocalDate aYearBefore = LocalDate.now().minus(Period.ofYears(1));
		LocalDate aYearAfter = LocalDate.now().plus(Period.ofYears(1));
		LocalDate.now().isLeapYear();
		Period years = Period.between(aYearBefore.plus(Period.ofDays(12)), aYearAfter);
		System.out.println(years.getYears() + ", " + years.getMonths() + ", "+ years.getDays());
		
//		for(String z: ZoneId.getAvailableZoneIds())
//			System.out.println(z + " : " + LocalTime.now(ZoneId.of(z)));
				
		System.out.println(LocalDate.now().minusDays(10));
		System.out.println(LocalDate.now().plusDays(10));
		Period days = Period.between(LocalDate.now(), LocalDate.now().with(TemporalAdjusters.lastDayOfYear()));
		System.out.println(days.getMonths());
		
	}

}
