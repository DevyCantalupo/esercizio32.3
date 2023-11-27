import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
public class MainTest {
    private final esercizio32di3 testing = new esercizio32di3();

    @Test
    void formatDate_withIso() {
        String result = testing.formatoFecha(OffsetDateTime.parse("2023-04-01T13:00:00Z"));
        assertEquals("01 aprile 2023", result);
    }

    @Test
    void formatDate_Null() {
        String result = testing.formatoFecha(null);
        assertNull(null, result);
    }
}
