package java_regular.data.type.classes.type.date_time.example5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterMain {
    public static void main(String[] atgs) {
        TemporalAdjusterMain main = new TemporalAdjusterMain();
        main.testTemporalAdjusters();
    }

    private void testTemporalAdjusters() {
        // Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        // get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        // get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }
}
