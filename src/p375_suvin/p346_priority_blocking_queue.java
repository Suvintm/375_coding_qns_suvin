//346) Implement a program to demonstrate PriorityBlockingQueue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.concurrent.*;

public class p346_priority_blocking_queue {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(50);
        pbq.add(10);
        System.out.println("Peek: " + pbq.peek());
        pbq.poll();
        System.out.println("After poll: " + pbq);
    }
}

//output
//Peek: 10
//After poll: [50]
