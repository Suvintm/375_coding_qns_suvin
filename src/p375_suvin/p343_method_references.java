//343) Write a program to demonstrate method references in Java.

package p375_suvin;
import java.util.*;

public class p343_method_references {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach(System.out::println);
    }
}

//output
//Apple
//Banana
//Cherry
