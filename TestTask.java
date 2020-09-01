import java.time.Duration;
import java.time.LocalDateTime;
import java.io.FileWriter;
import javax.xml.parsers.*;

public class TestTask {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter(args[0]);
        ScheduledTask test = new ScheduledTask("Task 1", "This is our very first task", Duration.ofHours(1), LocalDateTime.of(2020, 8, 31, 8, 30));
        System.out.println(test.getName() + test.getDescription() + test.getEstimatedDuration() + test.getDeadline()); 
        fw.write("<name> \n" + test.getName() + " \n </name> \n <Description> \n" + test.getDescription() + " \n </Description> \n <Estimated Duration>\n" + test.getEstimatedDuration() + "\n </Estimated Duration>\n" + "<Deadline> \n" + test.getDeadline() + "\n </Deadline>");
        fw.close();
    }

}