package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.Month.FEBRUARY;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @see Duration
 */
class Lesson07 extends Introduction {

    @Override
    protected void code() {

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");

        var date1 = ZonedDateTime.of(LocalDate.of(2018, FEBRUARY, 17), LocalTime.of(10, 0), zoneId);
        var date2 = date1.plusHours(2);
        var date3 = date1.plusDays(2);

        print("Date 1", date1);
        print("Date 2", date2);
        print("Date 3", date3);

        Duration duration1to2 = Duration.between(date1, date2);
        Duration duration1to3 = Duration.between(date1, date3);

        print("Duration between Date 1 and Date 2", duration1to2.abs());
        print("Duration between Date 1 and Date 3", duration1to3.abs());

        assertEquals(2, duration1to2.toHours());
        assertEquals(49, duration1to3.toHours());

    }

}
