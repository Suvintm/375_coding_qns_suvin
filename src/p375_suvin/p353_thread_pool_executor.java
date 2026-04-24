//353) Implement a program to create a thread pool and execute multiple tasks using Executor Service.

package p375_suvin;
import java.util.concurrent.*;

public class p353_thread_pool_executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 3; i++) {
            int taskNo = i;
            executor.execute(() -> System.out.println("Executing Task " + taskNo));
        }
        executor.shutdown();
    }
}

//output
//Executing Task 0
//Executing Task 1
//Executing Task 2
