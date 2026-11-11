import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final long  GIGASECOND_IN_SECONDS = 1_000_000_000L;
    private final LocalDateTime dateTime;
    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(GIGASECOND_IN_SECONDS);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
