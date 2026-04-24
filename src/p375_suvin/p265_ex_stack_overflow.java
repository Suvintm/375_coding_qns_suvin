//265) Implement a program to handle StackOverflowError.

package p375_suvin;

public class p265_ex_stack_overflow {
    static void recursive() {
        recursive();
    }

    public static void main(String[] args) {
        try {
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("Error caught: Stack overflow occurred.");
        }
    }
}

//output
//Error caught: Stack overflow occurred.
