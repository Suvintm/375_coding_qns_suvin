//321) Write a program to demonstrate LinkedHashMap by adding and retrieving key-value pairs.

package p375_suvin;
import java.util.*;

public class p321_coll_linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        System.out.println("Map: " + map);
    }
}

//output
//Map: {10=Ten, 20=Twenty}
