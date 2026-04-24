//109) Write a program to find the longest word in a string.

package p375_suvin;

public class p109_longest_word {
    public static void main(String[] args) {
        String s = "I love programming in Java";
        String[] words = s.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest word: " + longest);
    }
}

//output
//Longest word: programming
