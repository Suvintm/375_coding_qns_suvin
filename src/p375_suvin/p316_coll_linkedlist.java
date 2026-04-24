//316) Implement a program to demonstrate LinkedList by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p316_coll_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeFirst();
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

//output
//20
//30
