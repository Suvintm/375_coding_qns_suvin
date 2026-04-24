//273) Implement a program to handle ConcurrentModificationException.

package p375_suvin;
import java.util.*;

public class p273_ex_concurrent_mod {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>(Arrays.asList("A", "B"));
            for (String s : list) {
                list.remove(s);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Exception caught: Concurrent modification detected.");
        }
    }
}

//output
//Exception caught: Concurrent modification detected.
