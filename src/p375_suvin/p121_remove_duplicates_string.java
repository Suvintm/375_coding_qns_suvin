//121) Write a program to remove duplicates from a string.

package p375_suvin;

public class p121_remove_duplicates_string {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == -1) {
                result += s.charAt(i);
            }
        }
        System.out.println("Original: " + s);
        System.out.println("Result: " + result);
    }
}

//output
//Original: programming
//Result: progamin
