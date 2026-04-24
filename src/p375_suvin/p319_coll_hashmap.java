//319) Write a program to demonstrate HashMap by adding and retrieving key-value pairs.

package p375_suvin;
import java.util.*;

public class p319_coll_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println("Key 1: " + map.get(1));
        System.out.println("Key 2: " + map.get(2));
    }
}

//output
//Key 1: Apple
//Key 2: Banana
