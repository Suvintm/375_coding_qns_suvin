//117) Write a program to find the first repeating character in a string.

package p375_suvin;

public class p117_first_repeating_char {
    public static void main(String[] args) {
        String s = "hello";
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = s.charAt(i);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println("First repeating character: " + result);
    }
}

//output
//First repeating character: l
