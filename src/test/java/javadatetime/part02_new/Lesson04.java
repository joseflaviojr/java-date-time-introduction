package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

/**
 * Zoneless temporal-based classes.
 * They need time zone only in construction.
 * The time zone information is lost.
 *
 * @see Instant
 * @see LocalDate
 * @see LocalTime
 * @see LocalDateTime
 * @see Year
 * @see YearMonth
 * @see MonthDay
 */
class Lesson04 extends Introduction {

    @Override
    protected void code() {

        Instant instant = Instant.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        print("Instant", instant);
        print("LocalDate", localDate);
        print("LocalTime", localTime);
        print("LocalDateTime", localDateTime);
        print("Year", year);
        print("YearMonth", yearMonth);
        print("MonthDay", monthDay);

    }

}
