import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Task {
    private String name;
    private String description;
    private Duration estimated_duration;
    private LocalDateTime deadline;

    // Getters
    String getName() {
        return this.name;
    }
    String getDescription() {
        return this.description;
    }

    Duration getEstimatedDuration() {
        return this.estimated_duration;
    }

    LocalDateTime getDeadline() {
        return this.deadline;
    }


    // Setters
    // void setName (String n) { this.name = n;}
    // void setDescription (String n) { this.description = n;}

    // Constructor
    Task(String nam, String descrip, Duration estimated_dura, LocalDateTime deadl) {
        this.name = nam;
        this.description = descrip;
        this.estimated_duration = estimated_dura;
        this.deadline = deadl;
    }
}