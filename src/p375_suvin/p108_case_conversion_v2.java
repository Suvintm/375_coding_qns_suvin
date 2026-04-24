//108) Write a program to convert lowercase letters to uppercase and vice versa.

package p375_suvin;

public class p108_case_conversion_v2 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "CODE";
        System.out.println(s1 + " -> " + s1.toUpperCase());
        System.out.println(s2 + " -> " + s2.toLowerCase());
    }
}

//output
//java -> JAVA
//CODE -> code
