//116) Write a program to find the duplicate characters in a string.

package p375_suvin;

public class p116_duplicate_chars_string {
    public static void main(String[] args) {
        String s = "character";
        char[] chars = s.toCharArray();
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

//output
//Duplicate characters: c h a r 
