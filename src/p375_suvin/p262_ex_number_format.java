//262) Write a program to handle NumberFormatException.

package p375_suvin;

public class p262_ex_number_format {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format.");
        }
    }
}

//output
//Exception caught: Invalid number format.
