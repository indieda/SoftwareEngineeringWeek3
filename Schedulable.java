import java.time.Duration;
import java.time.LocalDateTime;

public interface Schedulable {
    void setStartTime(LocalDateTime st);

    LocalDateTime getStartTime();

    Duration getExpectedDuration();
}