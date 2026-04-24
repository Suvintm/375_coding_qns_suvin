//323) Write a program to demonstrate PriorityQueue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p323_coll_priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        System.out.println("Peek: " + pq.peek());
        pq.poll();
        System.out.println("After poll: " + pq);
    }
}

//output
//Peek: 10
//After poll: [30, 40]
