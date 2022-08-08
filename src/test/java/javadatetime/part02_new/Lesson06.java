package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.Month.JANUARY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @see ZonedDateTime
 */
class Lesson06 extends Introduction {

    @Override
    protected void code() {

        ZoneId spZoneId = ZoneId.of("America/Sao_Paulo");
        ZoneId utcZoneId = ZoneId.of("UTC");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(spZoneId);

        print("ZonedDateTime now", zonedDateTime);

        var zonedDateTime2018 = ZonedDateTime.of(LocalDate.of(2018, JANUARY, 10), LocalTime.of(15, 30), spZoneId);
        var zonedDateTime2022 = ZonedDateTime.of(LocalDate.of(2022, JANUARY, 10), LocalTime.of(15, 30), spZoneId);

        print("ZonedDateTime in 2018 (SP)", zonedDateTime2018);
        print("ZonedDateTime in 2022 (SP)", zonedDateTime2022);

        assertEquals(zonedDateTime2018.getZone(), zonedDateTime2022.getZone());
        assertNotEquals(zonedDateTime2018.getOffset(), zonedDateTime2022.getOffset());

        var zonedDateTime2018InUTC = zonedDateTime2018.withZoneSameInstant(utcZoneId);
        var zonedDateTime2022InUTC = zonedDateTime2022.withZoneSameInstant(utcZoneId);

        print("ZonedDateTime in 2018 (UTC)", zonedDateTime2018InUTC);
        print("ZonedDateTime in 2022 (UTC)", zonedDateTime2022InUTC);

    }

}
