//339) Write a program to demonstrate lambda expressions in Java.

package p375_suvin;
import java.util.*;

public class p339_lambda_expressions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(item -> System.out.println("Item: " + item));
    }
}

//output
//Item: A
//Item: B
//Item: C
