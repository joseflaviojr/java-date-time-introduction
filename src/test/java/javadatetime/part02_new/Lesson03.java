package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Instant;
import java.util.Date;

/**
 * Basic sources of {@link Instant}.
 */
class Lesson03 extends Introduction {

    @Override
    protected void code() {

        Date date = new Date();
        long timeMillis = System.currentTimeMillis();

        Instant instantItself = Instant.now();
        Instant instantFromDate = date.toInstant();
        Instant instantFromTimeMillis = Instant.ofEpochMilli(timeMillis);

        print("Instant itself", instantItself);
        print("Instant from Date object", instantFromDate);
        print("Instant from milliseconds (elapsed time of the epoch)", instantFromTimeMillis);

    }

}
