//368) Write a Java program to create multiple threads and use Phaser.

package p375_suvin;
import java.util.concurrent.*;

public class p368_thread_phaser {
    public static void main(String[] args) {
        Phaser p = new Phaser(1);
        new Thread(() -> { p.register(); System.out.println("T1 Phase 0"); p.arriveAndAwaitAdvance(); }).start();
        p.arriveAndDeregister();
        System.out.println("Main Phase Finished");
    }
}

//output
//T1 Phase 0
//Main Phase Finished
