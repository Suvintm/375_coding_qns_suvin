//93) Write a program to demonstrate the use of StringBuilder class.

package p375_suvin;

public class p93_stringbuilder_demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println("Result: " + sb.toString());
    }
}

//output
//Result: dlroW olleH
