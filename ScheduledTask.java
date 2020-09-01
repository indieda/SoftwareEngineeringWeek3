import java.time.Duration;
import java.time.LocalDateTime;

public class ScheduledTask extends Task implements Schedulable {
    private LocalDateTime start_time;
    Duration expected_duration;

    public void setStartTime(LocalDateTime st) {
        start_time = st;
    }

    public LocalDateTime getStartTime() {
        return start_time;
    }

    public Duration getExpectedDuration() {
        return this.expected_duration;
    }

    // Duration dura, LocalDateTime startTime
    ScheduledTask(String nam, String desc) {
        super(nam, desc, Duration.ofHours(1), LocalDateTime.of(2020, 8, 31, 8, 30));
        // getDescription();
        // setStartTime(startTime);

    }
}

/*
 * <Task> <name> Task 1 <\name> <description> This is our very first task
 * <\description> <\Task>
 */