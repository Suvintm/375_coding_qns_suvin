//271) Implement a program to handle UnsupportedOperationException.

package p375_suvin;
import java.util.*;

public class p271_ex_unsupported_op {
    public static void main(String[] args) {
        try {
            List<String> list = Arrays.asList("A", "B");
            list.add("C");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught: Operation not supported.");
        }
    }
}

//output
//Exception caught: Operation not supported.
