//125) Write a program to find the longest common prefix among an array of strings.

package p375_suvin;

public class p125_longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        if (strs.length == 0) System.out.println("");
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println("Longest common prefix: " + prefix);
    }
}

//output
//Longest common prefix: fl
