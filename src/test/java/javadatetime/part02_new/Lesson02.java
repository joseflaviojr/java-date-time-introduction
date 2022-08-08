package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.Instant;

import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Basic time.
 *
 * @see Instant
 */
class Lesson02 extends Introduction {

    @Override
    protected void code() {

        Instant instant = Instant.now();

        long epochSecond = instant.getEpochSecond();
        int nano = instant.getNano();

        print("Instant's Epoch Seconds", epochSecond);
        print("Instant's Nanoseconds Fraction", nano);

        assertTrue(epochSecond >= 0);
        assertTrue(nano >= 0 && nano < (int) pow(10, 9));

    }

}
