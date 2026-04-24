//322) Implement a program to demonstrate Queue by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p322_coll_queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("One");
        q.add("Two");
        q.remove();
        for (String s : q) {
            System.out.println(s);
        }
    }
}

//output
//Two
