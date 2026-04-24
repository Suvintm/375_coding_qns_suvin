//330) Implement a program to demonstrate Vector by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p330_coll_vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("X");
        v.add("Y");
        v.remove("X");
        System.out.println("Vector: " + v);
    }
}

//output
//Vector: [Y]
