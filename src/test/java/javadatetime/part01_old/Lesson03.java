package javadatetime.part01_old;

import javadatetime.util.Introduction;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Elapsed time calculation.
 *
 * @see System#nanoTime()
 */
class Lesson03 extends Introduction {

    @Override
    protected void code() throws InterruptedException {

        long millisTime = System.currentTimeMillis();
        long nanoTime = System.nanoTime();

        sleep(2500);

        millisTime = System.currentTimeMillis() - millisTime;
        nanoTime = System.nanoTime() - nanoTime;

        print("Time lapse in milliseconds", millisTime);
        print("Time lapse in nanoseconds", nanoTime);

        double nanoTimeInMillis = nanoTime / pow(10, 6);

        print("Nanoseconds to milliseconds", nanoTimeInMillis);

        assertTrue(abs(millisTime - nanoTimeInMillis) <= 1);

    }

}
