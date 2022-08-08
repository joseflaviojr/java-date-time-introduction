package javadatetime.part01_old;

import javadatetime.util.Introduction;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.util.Calendar.HOUR_OF_DAY;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Difference between time zones.
 *
 * @see TimeZone
 * @see Calendar
 */
class Lesson07 extends Introduction {

    @Override
    protected void code() {

        Date now = new Date();

        TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
        TimeZone saoPauloTimeZone = TimeZone.getTimeZone("America/Sao_Paulo");

        Calendar calendar1 = Calendar.getInstance(utcTimeZone);
        Calendar calendar2 = Calendar.getInstance(saoPauloTimeZone);

        calendar1.setTime(now);
        calendar2.setTime(now);

        int hourOnCalendar1 = calendar1.get(HOUR_OF_DAY);
        int hourOnCalendar2 = calendar2.get(HOUR_OF_DAY);

        print("Hour now on Calendar 1", hourOnCalendar1);
        print("Hour now on Calendar 2", hourOnCalendar2);

        assertNotEquals(hourOnCalendar1, hourOnCalendar2);

    }

}
