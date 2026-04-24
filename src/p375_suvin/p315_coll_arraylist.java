//315) Write a program to demonstrate ArrayList by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p315_coll_arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.remove("Python");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

//output
//Java
//C++
