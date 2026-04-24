//333) Write a program to demonstrate Iterator by iterating over elements of a collection.

package p375_suvin;
import java.util.*;

public class p333_coll_iterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Blue", "Green");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

//output
//Red
//Blue
//Green
