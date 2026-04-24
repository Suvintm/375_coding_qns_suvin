//105) Write a program to remove all white spaces from a string.

package p375_suvin;

public class p105_remove_spaces {
    public static void main(String[] args) {
        String s = "  J a v a   P r o g r a m  ";
        String result = s.replaceAll("\\s", "");
        System.out.println("Original: \"" + s + "\"");
        System.out.println("Result: \"" + result + "\"");
    }
}

//output
//Original: "  J a v a   P r o g r a m  "
//Result: "JavaProgram"
