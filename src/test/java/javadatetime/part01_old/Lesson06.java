package javadatetime.part01_old;

import javadatetime.util.Introduction;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.JANUARY;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * {@link Calendar} with {@link TimeZone}.
 */
class Lesson06 extends Introduction {

    @Override
    protected void code() {

        Date date0 = new Date(0);

        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date0);

        int day = calendar.get(DAY_OF_MONTH);
        int month = calendar.get(MONTH);
        int year = calendar.get(YEAR);

        print("Day from Calendar", day);
        print("Month from Calendar", month + 1);
        print("Year from Calendar", year);

        assertEquals(1, day);
        assertEquals(JANUARY, month);
        assertEquals(1970, year);

        Date dateFromCalendar = calendar.getTime();
        print("Date object from Calendar", dateFromCalendar);
        assertFalse(dateFromCalendar.toString().contains("1970"));

    }

}
