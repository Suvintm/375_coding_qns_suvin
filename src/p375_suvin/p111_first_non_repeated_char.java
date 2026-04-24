//111) Write a program to find the first non-repeated character in a string.

package p375_suvin;

public class p111_first_non_repeated_char {
    public static void main(String[] args) {
        String s = "swiss";
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result = s.charAt(i);
                break;
            }
        }
        System.out.println("First non-repeated character: " + result);
    }
}

//output
//First non-repeated character: w
