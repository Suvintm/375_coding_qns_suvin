//260) Write a program to handle NullPointerException.

package p375_suvin;

public class p260_ex_null_pointer {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Null pointer access.");
        }
    }
}

//output
//Exception caught: Null pointer access.
