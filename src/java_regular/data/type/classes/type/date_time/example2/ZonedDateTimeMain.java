package java_regular.data.type.classes.type.date_time.example2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTimeMain main = new ZonedDateTimeMain();
        main.testZonedDateTime();
    }

    private void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " +date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " +id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " +currentZone);
    }
}
