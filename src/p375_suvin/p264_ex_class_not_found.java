//264) Write a program to handle ClassNotFoundException.

package p375_suvin;

public class p264_ex_class_not_found {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception caught: Class not found.");
        }
    }
}

//output
//Exception caught: Class not found.
