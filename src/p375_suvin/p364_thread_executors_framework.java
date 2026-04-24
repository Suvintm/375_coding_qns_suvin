//364) Write a Java program to create multiple threads and use Executors framework.

package p375_suvin;
import java.util.concurrent.*;

public class p364_thread_executors_framework {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.submit(() -> System.out.println("Async Task Running"));
        ex.shutdown();
    }
}

//output
//Async Task Running
