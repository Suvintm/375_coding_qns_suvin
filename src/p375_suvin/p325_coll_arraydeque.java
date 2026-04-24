//325) Write a program to demonstrate ArrayDeque by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p325_coll_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.addFirst("Front");
        ad.addLast("Back");
        System.out.println("Deque: " + ad);
        ad.removeFirst();
        System.out.println("After remove: " + ad);
    }
}

//output
//Deque: [Front, Back]
//After remove: [Back]
