//324) Implement a program to demonstrate Stack by adding, removing, and iterating over elements.

package p375_suvin;
import java.util.*;

public class p324_coll_stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Base");
        stack.push("Top");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}

//output
//Pop: Top
//Stack: [Base]
