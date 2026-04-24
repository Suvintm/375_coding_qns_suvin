//269) Implement a program to handle IllegalStateException.

package p375_suvin;
import java.util.*;

public class p269_ex_illegal_state {
    public static void main(String[] args) {
        try {
            Iterator<String> it = Arrays.asList("A").iterator();
            it.remove();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: Illegal state for operation.");
        }
    }
}

//output
//Exception caught: Illegal state for operation.
