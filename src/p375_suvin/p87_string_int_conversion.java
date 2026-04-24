//87) Write a program to convert a string to integer and vice versa.

package p375_suvin;

public class p87_string_int_conversion {
    public static void main(String[] args) {
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println("String to int: " + i);
        
        String sBack = String.valueOf(i);
        System.out.println("Int to string: " + sBack);
    }
}

//output
//String to int: 100
//Int to string: 100
