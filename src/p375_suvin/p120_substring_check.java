//120) Write a program to check whether a string is a substring of another string.

package p375_suvin;

public class p120_substring_check {
    public static void main(String[] args) {
        String main = "Programming in Java";
        String sub = "Java";
        if (main.contains(sub)) System.out.println("\"" + sub + "\" is a substring of \"" + main + "\"");
        else System.out.println("\"" + sub + "\" is not a substring");
    }
}

//output
//"Java" is a substring of "Programming in Java"
