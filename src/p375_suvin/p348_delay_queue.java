//348) Implement a program to demonstrate DelayQueue by adding and retrieving elements.

package p375_suvin;
import java.util.concurrent.*;
import java.util.*;

class DelayedElement implements Delayed {
    private String name;
    private long expiryTime;
    DelayedElement(String name, long delay) { this.name = name; this.expiryTime = System.currentTimeMillis() + delay; }
    public long getDelay(TimeUnit unit) { return unit.convert(expiryTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS); }
    public int compareTo(Delayed o) { return Long.compare(this.expiryTime, ((DelayedElement)o).expiryTime); }
    public String toString() { return name; }
}

public class p348_delay_queue {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> dq = new DelayQueue<>();
        dq.put(new DelayedElement("Task 1", 100));
        System.out.println("Taken: " + dq.take());
    }
}

//output
//Taken: Task 1
