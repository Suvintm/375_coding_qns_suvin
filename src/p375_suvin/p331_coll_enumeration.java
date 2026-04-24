//331) Write a program to demonstrate Enumeration by iterating over elements of a collection.

package p375_suvin;
import java.util.*;

public class p331_coll_enumeration {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("A", "B", "C"));
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

//output
//A
//B
//C
