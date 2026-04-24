//372) Write a Java program to create multiple threads and use CompletionService.

package p375_suvin;
import java.util.concurrent.*;

public class p372_thread_completion_service {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        CompletionService<String> cs = new ExecutorCompletionService<>(ex);
        cs.submit(() -> "Task 1 Done");
        System.out.println(cs.take().get());
        ex.shutdown();
    }
}

//output
//Task 1 Done
