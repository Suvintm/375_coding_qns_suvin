//277) Implement a program to handle PatternSyntaxException.

package p375_suvin;
import java.util.regex.*;

public class p277_ex_pattern_syntax {
    public static void main(String[] args) {
        try {
            Pattern.compile("[");
        } catch (PatternSyntaxException e) {
            System.out.println("Exception caught: Invalid regex pattern.");
        }
    }
}

//output
//Exception caught: Invalid regex pattern.
