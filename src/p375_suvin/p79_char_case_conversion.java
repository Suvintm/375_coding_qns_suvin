//79) Write a program to perform operations on characters such as converting lowercase to uppercase and vice versa.

package p375_suvin;

public class p79_char_case_conversion {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'B';
        
        System.out.println(c1 + " to uppercase: " + Character.toUpperCase(c1));
        System.out.println(c2 + " to lowercase: " + Character.toLowerCase(c2));
    }
}

//output
//a to uppercase: A
//B to lowercase: b
