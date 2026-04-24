//328) Implement a program to demonstrate Hashtable by adding and retrieving key-value pairs.

package p375_suvin;
import java.util.*;

public class p328_coll_hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(101, "Amit");
        ht.put(102, "Bina");
        System.out.println("101: " + ht.get(101));
    }
}

//output
//101: Amit
