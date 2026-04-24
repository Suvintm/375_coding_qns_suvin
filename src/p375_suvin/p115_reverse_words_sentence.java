//115) Write a program to reverse words in a sentence.

package p375_suvin;

public class p115_reverse_words_sentence {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + (i == 0 ? "" : " ");
        }
        System.out.println("Original: " + s);
        System.out.println("Result: " + result);
    }
}

//output
//Original: Java is fun
//Result: fun is Java
