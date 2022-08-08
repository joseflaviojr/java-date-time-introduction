package javadatetime.part02_new;

import javadatetime.util.Introduction;

import java.time.ZoneId;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see ZoneId
 */
class Lesson01 extends Introduction {

    @Override
    protected void code() {

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        print("Number of zone IDs", availableZoneIds.size());

        for (String id : availableZoneIds) {
            print(id);
        }

        assertTrue(availableZoneIds.contains("America/Sao_Paulo"));

    }

}
