//272) Write a program to handle UnsupportedOperationException. (Repeat)

package p375_suvin;
import java.util.*;

public class p272_ex_unsupported_op_v2 {
    public static void main(String[] args) {
        try {
            List<String> list = Collections.unmodifiableList(new ArrayList<>());
            list.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught: Modify operation not supported.");
        }
    }
}

//output
//Exception caught: Modify operation not supported.
