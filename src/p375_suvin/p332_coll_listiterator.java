//332) Implement a program to demonstrate ListIterator by iterating over elements of a list.

package p375_suvin;
import java.util.*;

public class p332_coll_listiterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Reverse:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

//output
//1
//2
//3
//Reverse:
//3
//2
//1
