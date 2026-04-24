//92) Write a program to convert a string to uppercase and vice versa.

package p375_suvin;

public class p92_string_case_toggle {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "WORLD";
        System.out.println(s1 + " to uppercase: " + s1.toUpperCase());
        System.out.println(s2 + " to lowercase: " + s2.toLowerCase());
    }
}

//output
//hello to uppercase: HELLO
//WORLD to lowercase: world
