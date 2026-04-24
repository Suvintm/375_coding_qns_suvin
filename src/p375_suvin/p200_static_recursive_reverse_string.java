//200) Write a program to reverse a string using recursion and a static method.

package p375_suvin;

public class p200_static_recursive_reverse_string {
    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverse(s));
    }
}

//output
//Original: Hello
//Reversed: olleH
