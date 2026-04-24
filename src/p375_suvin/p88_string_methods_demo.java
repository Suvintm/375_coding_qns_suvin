//88) Write a program to demonstrate the use of string methods such as substring, indexOf, and equals.

package p375_suvin;

public class p88_string_methods_demo {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Substring(0, 5): " + s.substring(0, 5));
        System.out.println("Index of 'W': " + s.indexOf('W'));
        System.out.println("Equals 'Hello World': " + s.equals("Hello World"));
    }
}

//output
//Substring(0, 5): Hello
//Index of 'W': 6
//Equals 'Hello World': true
