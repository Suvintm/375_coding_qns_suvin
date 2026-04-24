//342) Implement a program to demonstrate Optional class usage.

package p375_suvin;
import java.util.*;

public class p342_optional_class {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println("Is present: " + opt.isPresent());
        System.out.println("Default: " + opt.orElse("Default Value"));
    }
}

//output
//Is present: false
//Default: Default Value
