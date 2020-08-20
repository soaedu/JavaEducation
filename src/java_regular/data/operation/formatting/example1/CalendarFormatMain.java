package java_regular.data.operation.formatting.example1;

import java_regular.data.type.enums.example3.Weekday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarFormatMain {
    static Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        System.out.println("\nCurrent calendar data:" +
                "\n\tmonth number: " +calendar.get(Calendar.MONTH)+
                "\n\tday: " +calendar.get(Calendar.DAY_OF_MONTH)+
                "\n\tday name: " + Weekday.values()[calendar.get(Calendar.DAY_OF_WEEK)-1]
        );

        setCalendarData();
        formatCalendar();
        // printTimezones();
    }

    private static void setCalendarData() {
        // #1
        // calendar.set(2077, 8,29);

        // #2
        calendar.set(Calendar.YEAR, 2077);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 29);

        System.out.println("\nFuture calendar data:" +
                "\n\tmonth number: " +calendar.get(Calendar.MONTH)+
                "\n\tday: " +calendar.get(Calendar.DAY_OF_MONTH));
    }

    private static void formatCalendar() {
        System.out.print("\nFuture calendar data (System.out.format):");
        // "May 29, 2006"
        String formatAsDate1 = "%tB %te, %tY%n";
        System.out.print("\n\tformatted to date(" +formatAsDate1+ "): ");
        System.out.format(formatAsDate1, calendar, calendar, calendar);
        // "05/29/06"
        String formatAsDate2 = "%tD%n";
        System.out.print("\tformatted to date(" +formatAsDate2+ "): ");
        System.out.format(formatAsDate2, calendar);
        // "2:34 am"
        String formatAsTime = "%tl:%tM %tp%n";
        System.out.print("\tformatted to time(" +formatAsTime+ "): ");
        System.out.format(formatAsTime, calendar, calendar, calendar);

        Locale ruLocale = new Locale("ru","ru");
        System.out.print("\nFuture calendar data (SimpleDateFormat.format):");
        final String DATE_FORMAT = "yyyy/MM/dd E HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, ruLocale);
        System.out.println("\n\tformatted to date(" +DATE_FORMAT+ "): " +simpleDateFormat.format(calendar.getTime()));

        System.out.print("\nFuture calendar data (DateFormat.format):");
        // 29.09.2077
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.SHORT, ruLocale);
        System.out.print("\n\tformatted to date (short_ru): " +dateFormat1.format(calendar.getTime()));
        // 29 сентября 2077 г.
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG, ruLocale);
        System.out.print("\n\tformatted to date (long_ru): " +dateFormat2.format(calendar.getTime()));
        // 11:49
        DateFormat timeFormat1 = DateFormat.getTimeInstance(DateFormat.SHORT, ruLocale);
        System.out.print("\n\tformatted to time (short_ru): " +timeFormat1.format(calendar.getTime()));
        // 11:49:59 EEST
        DateFormat timeFormat2 = DateFormat.getTimeInstance(DateFormat.LONG, ruLocale);
        System.out.print("\n\tformatted to date (long_ru): " +timeFormat2.format(calendar.getTime()));
        // 11:49:59 AM EEST
        Locale enLocale = new Locale("en","us");
        DateFormat timeFormat3 = DateFormat.getTimeInstance(DateFormat.LONG, enLocale);
        System.out.println("\n\tformatted to date (long_en): " +timeFormat3.format(calendar.getTime()));
    }

    private static void printTimezones() {
        Calendar egyptCalendar = null;
        System.out.print("\nAvailable timezones:");
        for(String timeZone : TimeZone.getAvailableIDs()) {
            System.out.print("\n\ttimezone: " + timeZone);

            if (timeZone.equalsIgnoreCase("Egypt")) {
                egyptCalendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
            }
        }

        if (egyptCalendar != null) {
            System.out.print("\n\nEgypt calendar data:" +
                    "\n\tmonth number: " + egyptCalendar.get(Calendar.MONTH) +
                    "\n\tday: " + egyptCalendar.get(Calendar.DAY_OF_MONTH));
        }
    }
}
