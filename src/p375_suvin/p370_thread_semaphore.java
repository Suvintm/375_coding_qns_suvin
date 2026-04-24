//370) Write a Java program to create multiple threads and use Semaphore.

package p375_suvin;
import java.util.concurrent.*;

public class p370_thread_semaphore {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);
        new Thread(() -> {
            try { s.acquire(); System.out.println("T1 Acquired"); Thread.sleep(100); s.release(); } catch(Exception e){}
        }).start();
        new Thread(() -> {
            try { s.acquire(); System.out.println("T2 Acquired"); s.release(); } catch(Exception e){}
        }).start();
    }
}

//output
//T1 Acquired
//T2 Acquired
