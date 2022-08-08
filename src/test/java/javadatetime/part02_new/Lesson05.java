package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

import static java.time.Month.APRIL;

/**
 * Zoneless temporal-based objects from/to {@link Instant}.
 *
 * @see ZoneOffset
 */
class Lesson05 extends Introduction {

    @Override
    protected void code() {

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        TimeZone.setDefault(timeZone);

        Instant instant = Instant.now();

        LocalDate localDate = LocalDate.ofInstant(instant, zoneId);
        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);

        print("Instant", instant);
        print("LocalDate from Instant", localDate);
        print("LocalTime from Instant", localTime);
        print("LocalDateTime from Instant", localDateTime);

        ZoneOffset zoneOffset = zoneId.getRules().getOffset(instant);

        print("ZoneOffset", zoneOffset);

        Instant instantFromLocalDate = localDate.atStartOfDay().toInstant(zoneOffset);
        Instant instantFromLocalTime = localTime.atDate(LocalDate.of(1985, APRIL, 25)).toInstant(zoneOffset);
        Instant instantToLocalDateTime = localDateTime.toInstant(zoneOffset);

        print("Instant from LocalDate", instantFromLocalDate);
        print("Instant from LocalTime", instantFromLocalTime);
        print("Instant from LocalDateTime", instantToLocalDateTime);

    }

}
