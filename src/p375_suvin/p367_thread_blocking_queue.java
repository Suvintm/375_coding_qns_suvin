//367) Implement a program to demonstrate thread communication using BlockingQueue.

package p375_suvin;
import java.util.concurrent.*;

public class p367_thread_blocking_queue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(1);
        new Thread(() -> { try { System.out.println("Popped: " + bq.take()); } catch(Exception e){} }).start();
        bq.put(500);
    }
}

//output
//Popped: 500
