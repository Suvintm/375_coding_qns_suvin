//112) Write a program to check whether a string contains only digits or not.

package p375_suvin;

public class p112_only_digits_check {
    public static void main(String[] args) {
        String s = "12345";
        boolean onlyDigits = s.matches("[0-9]+");
        if (onlyDigits) System.out.println("String contains only digits");
        else System.out.println("String contains non-digit characters");
    }
}

//output
//String contains only digits
