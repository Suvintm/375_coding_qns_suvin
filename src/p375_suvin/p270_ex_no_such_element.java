//270) Write a program to handle NoSuchElementException.

package p375_suvin;
import java.util.*;

public class p270_ex_no_such_element {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            Iterator<String> it = list.iterator();
            it.next();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: No such element found.");
        }
    }
}

//output
//Exception caught: No such element found.
