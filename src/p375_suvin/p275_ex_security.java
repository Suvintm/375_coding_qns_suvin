//275) Implement a program to handle SecurityException.

package p375_suvin;

public class p275_ex_security {
    public static void main(String[] args) {
        try {
            throw new SecurityException("Security violation");
        } catch (SecurityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//output
//Exception caught: Security violation
