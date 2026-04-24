//317) Write a program to demonstrate HashSet by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p317_coll_hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Red"); // Duplicate
        set.remove("Green");
        for (String s : set) {
            System.out.println(s);
        }
    }
}

//output
//Red
