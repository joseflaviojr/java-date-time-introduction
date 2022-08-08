package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @see Period
 */
class Lesson08 extends Introduction {

    @Override
    protected void code() {

        var date1 = LocalDateTime.now().withHour(23).withMinute(0);
        var date2 = date1.plusHours(23);

        print("Date 1", date1);
        print("Date 2", date2);

        Period period = Period.between(date1.toLocalDate(), date2.toLocalDate());
        Duration duration = Duration.between(date1, date2);

        print("Period between dates", period);
        print("Duration between dates", duration);

        long periodDays = period.getDays();
        long durationDays = duration.toDays();

        print("Period days between dates", periodDays);
        print("Duration days between dates", durationDays);

        assertEquals(1, periodDays);
        assertEquals(0, durationDays);

    }

}
