package javadatetime.part01_old;

import javadatetime.util.Introduction;

import java.util.List;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see TimeZone
 * @see <a href="http://www.iana.org/time-zones">Time Zone Database</a>
 */
class Lesson08 extends Introduction {

    @Override
    protected void code() {

        String[] availableIDs = TimeZone.getAvailableIDs();

        print("Number of time zones", availableIDs.length);

        for (String id : availableIDs) {
            print(id);
        }

        assertTrue(List.of(availableIDs).contains("America/Sao_Paulo"));

    }

}
