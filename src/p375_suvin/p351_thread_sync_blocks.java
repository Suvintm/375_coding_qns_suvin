//351) Implement a program to demonstrate thread synchronization using synchronized blocks.

package p375_suvin;

class Counter {
    int count = 0;
    void increment() { synchronized(this) { count++; } }
}

public class p351_thread_sync_blocks {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> { for(int i=0; i<1000; i++) c.increment(); });
        Thread t2 = new Thread(() -> { for(int i=0; i<1000; i++) c.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count: " + c.count);
    }
}

//output
//Count: 2000
