package javadatetime.part01_old;

import javadatetime.util.Introduction;

import java.util.Date;

/**
 * @see Date
 * @see Date#Date()
 * @see <a href="https://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time (UTC)</a>
 * @see <a href="https://en.wikipedia.org/wiki/Greenwich_Mean_Time">Greenwich Mean Time (GMT)</a>
 * @see <a href="https://en.wikipedia.org/wiki/Universal_Time">Universal Time (UT)</a>
 * @see <a href="https://en.wikipedia.org/wiki/Leap_second">Leap second</a>
 */
class Lesson04 extends Introduction {

    @Override
    protected void code() {

        Date date = new Date();

        print("Date", date);

    }

}
