//349) Write a program to demonstrate ConcurrentLinkedQueue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.concurrent.*;

public class p349_concurrent_linked_queue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<>();
        clq.add("Item 1");
        clq.add("Item 2");
        clq.poll();
        System.out.println("Remaining: " + clq);
    }
}

//output
//Remaining: [Item 2]
