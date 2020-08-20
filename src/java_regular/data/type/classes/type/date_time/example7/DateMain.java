package java_regular.data.type.classes.type.date_time.example7;

import java_regular.data.type.enums.example3.Weekday;

import java.util.Date;

public class DateMain {
    static Date now = new Date();

    public static void main(String[] args) {
        showWeekday();
        setBirthDay();
    }

    private static void showWeekday() {
        Weekday curWeekday = Weekday.values()[now.getDay()-1];
        System.out.println("\nCurrent weekday is: " +curWeekday);
    }

    private static void setBirthDay() {
        String date = "1977/12/29";
        Date birthday = new Date(Date.parse(date));
        birthday.setYear(now.getYear());    // date in the future
        birthday.setYear(now.getYear()-1);  // date in the past

        String setBirthResult = (birthday.after(now) ? "The birthday is incorrect, because it specifies the date " +
                "in the future.": String.valueOf(birthday.toLocaleString()));

        System.out.println(setBirthResult);
    }
}
