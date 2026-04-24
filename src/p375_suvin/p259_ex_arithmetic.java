//259) Implement a program to handle ArithmeticException (division by zero).

package p375_suvin;

public class p259_ex_arithmetic {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }
    }
}

//output
//Exception caught: Cannot divide by zero.
