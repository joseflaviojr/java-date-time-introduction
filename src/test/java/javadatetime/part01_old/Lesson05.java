package javadatetime.part01_old;

import javadatetime.util.Introduction;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Time zone problem.
 */
class Lesson05 extends Introduction {

    @Override
    protected void code() {

        Date date0 = new Date(0);

        print("Initial Date", date0);

        assertEquals(0, date0.getTime());
        assertFalse(date0.toString().contains("1970"));

    }

}
