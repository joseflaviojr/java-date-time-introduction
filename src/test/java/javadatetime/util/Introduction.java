package javadatetime.util;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Introduction {

    @Test
    void run() throws Exception {
        Locale.setDefault(Locale.US);
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("America/Sao_Paulo")));
        code();
    }

    protected abstract void code() throws Exception;

    protected void print(Object content) {
        System.out.println(content);
    }

    protected void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    protected void print(String caption, Object value) {
        printf("%s: %s\n", caption, value);
    }

}
