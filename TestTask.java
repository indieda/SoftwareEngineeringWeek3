import java.time.Duration;
import java.time.LocalDateTime;


public class TestTask {
    public static void main(String[] args) throws Exception {
        Blah testses = new Blah(); 
        testses.talk();
        ScheduledTask test = new ScheduledTask("Task 1", "This is our very first task");
        System.out.println("Taskname " + test.getName()); 
    }

}