//327) Write a program to demonstrate BitSet by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p327_coll_bitset {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(5);
        bs.clear(2);
        System.out.println("BitSet: " + bs);
        System.out.println("Is set at 0: " + bs.get(0));
    }
}

//output
//BitSet: {0, 5}
//Is set at 0: true
