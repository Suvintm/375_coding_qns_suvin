//85) Write a program to concatenate two strings.

package p375_suvin;

public class p85_concatenate_strings {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "Suvin";
        String s3 = s1.concat(s2);
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Concatenated: " + s3);
    }
}

//output
//String 1: Hello 
//String 2: Suvin
//Concatenated: Hello Suvin
