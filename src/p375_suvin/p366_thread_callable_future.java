//366) Write a Java program to create multiple threads and use Callable and Future.

package p375_suvin;
import java.util.concurrent.*;

public class p366_thread_callable_future {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> f = ex.submit(() -> "Future result");
        System.out.println(f.get());
        ex.shutdown();
    }
}

//output
//Future result
