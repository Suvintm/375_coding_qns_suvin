//113) Write a program to find all permutations of a string.

package p375_suvin;

public class p113_string_permutations {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Permutations of " + s + ":");
        permute(s, "");
    }

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }
}

//output
//Permutations of ABC:
//ABC ACB BAC BCA CAB CBA 
