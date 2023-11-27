import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.SequencedSet;
public class esercizio32di3 {
    public static void main(String[] args) {
        String fechaString = "2023-03-01T13:00:00Z";
        OffsetDateTime fecha = crearOffsetDateTime(fechaString);
        System.out.println(formatoFecha(fecha));
    }
    public static OffsetDateTime crearOffsetDateTime(String fechaString) {
        return OffsetDateTime.parse(fechaString);
    }

    public static String formatoFecha(OffsetDateTime fecha) {
        if (fecha == null) {
            return null;
        } else {
            String x = fecha.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
            return x;
        }
    }
}
