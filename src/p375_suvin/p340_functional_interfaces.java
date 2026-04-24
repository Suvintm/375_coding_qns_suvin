//340) Implement a program to demonstrate functional interfaces using Java 8 features.

package p375_suvin;
import java.util.function.*;

public class p340_functional_interfaces {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println("Length of 'Java': " + lengthFunc.apply("Java"));
    }
}

//output
//Is 10 even? true
//Length of 'Java': 4
