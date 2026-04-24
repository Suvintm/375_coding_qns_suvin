//374) Write a Java program to create multiple threads and use ScheduledExecutorService.

package p375_suvin;
import java.util.concurrent.*;

public class p374_thread_scheduled_executor {
    public static void main(String[] args) {
        ScheduledExecutorService sch = Executors.newSingleThreadScheduledExecutor();
        sch.schedule(() -> System.out.println("Scheduled Task Executed"), 100, TimeUnit.MILLISECONDS);
        sch.shutdown();
    }
}

//output
//Scheduled Task Executed
