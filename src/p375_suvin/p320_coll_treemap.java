//320) Implement a program to demonstrate TreeMap by adding and retrieving key-value pairs.

package p375_suvin;
import java.util.*;

public class p320_coll_treemap {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("IN", "India");
        map.put("US", "United States");
        System.out.println("IN: " + map.get("IN"));
        System.out.println("US: " + map.get("US"));
    }
}

//output
//IN: India
//US: United States
