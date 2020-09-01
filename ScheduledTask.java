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

    
    ScheduledTask(String nam, String desc,Duration dura, LocalDateTime startTime) {
        super(nam, desc, dura, startTime);
         System.out.println(getDeadline());
         

    }
}

/*
 * <Task> <name> Task 1 <\name> <description> This is our very first task
 * <\description> <\Task>
 */