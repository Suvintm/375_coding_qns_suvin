//114) Write a program to find the frequency of each character in a string.

package p375_suvin;

public class p114_char_frequency_string {
    public static void main(String[] args) {
        String s = "hello";
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        System.out.println("Character | Frequency");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) System.out.println("    " + (char)i + "    |    " + freq[i]);
        }
    }
}

//output
//Character | Frequency
//    e    |    1
//    h    |    1
//    l    |    2
//    o    |    1
