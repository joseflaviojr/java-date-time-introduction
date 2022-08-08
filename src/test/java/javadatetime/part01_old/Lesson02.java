package javadatetime.part01_old;

import javadatetime.util.Introduction;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Time resolution.
 *
 * @see System#currentTimeMillis()
 * @see System#nanoTime()
 */
class Lesson02 extends Introduction {

    @Override
    protected void code() {

        long millisTime = System.currentTimeMillis();
        long nanoTime = System.nanoTime();

        print("\"Chronological\" time (milliseconds)", millisTime);
        print("Time to measurement (nanoseconds)", nanoTime);

        assertTrue(millisTime >= 0);
        assertTrue(nanoTime >= 0);

    }

}
