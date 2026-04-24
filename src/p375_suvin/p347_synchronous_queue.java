//347) Write a program to demonstrate SynchronousQueue by adding and removing elements.

package p375_suvin;
import java.util.concurrent.*;

public class p347_synchronous_queue {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<String> sq = new SynchronousQueue<>();
        new Thread(() -> {
            try { System.out.println("Received: " + sq.take()); } catch (Exception e) {}
        }).start();
        sq.put("Hello Sync");
    }
}

//output
//Received: Hello Sync
