//358) Write a Java program to create multiple threads and wait for them to complete using CountDownLatch.

package p375_suvin;
import java.util.concurrent.*;

public class p358_thread_countdownlatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(() -> { System.out.println("T1 Finished"); latch.countDown(); }).start();
        new Thread(() -> { System.out.println("T2 Finished"); latch.countDown(); }).start();
        latch.await();
        System.out.println("All threads finished.");
    }
}

//output
//T1 Finished
//T2 Finished
//All threads finished.
