//118) Write a program to capitalize the first letter of each word in a sentence.

package p375_suvin;

public class p118_capitalize_words {
    public static void main(String[] args) {
        String s = "java is very fun";
        String[] words = s.split(" ");
        String result = "";
        for (String w : words) {
            result += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
        }
        System.out.println("Result: " + result.trim());
    }
}

//output
//Result: Java Is Very Fun
