//318) Implement a program to demonstrate TreeSet by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p318_coll_treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.remove(30);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}

//output
//10
//50
