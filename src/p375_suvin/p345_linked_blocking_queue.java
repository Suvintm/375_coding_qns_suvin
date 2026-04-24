//345) Write a program to demonstrate LinkedBlockingQueue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.concurrent.*;

public class p345_linked_blocking_queue {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> lbq = new LinkedBlockingQueue<>();
        lbq.add("One");
        lbq.add("Two");
        lbq.remove("One");
        for (String s : lbq) {
            System.out.println(s);
        }
    }
}

//output
//Two
