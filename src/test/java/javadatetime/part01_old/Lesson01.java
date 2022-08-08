package javadatetime.part01_old;

import javadatetime.util.Introduction;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Basic time.
 *
 * @see System#currentTimeMillis()
 * @see <a href="https://en.wikipedia.org/wiki/Unix_time">Unix timestamp</a>
 */
class Lesson01 extends Introduction {

    @Override
    protected void code() {

        long nowTime = System.currentTimeMillis();

        print("Time in milliseconds", nowTime);

        assertTrue(nowTime >= 0);

    }

}
