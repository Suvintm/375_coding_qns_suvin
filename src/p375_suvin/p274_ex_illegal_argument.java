//274) Write a program to handle IllegalArgumentException.

package p375_suvin;

public class p274_ex_illegal_argument {
    static void checkAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
    }

    public static void main(String[] args) {
        try {
            checkAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//output
//Exception caught: Age cannot be negative
