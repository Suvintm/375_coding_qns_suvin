//198) Write a program to find the power of a number using recursion and a static method.

package p375_suvin;

public class p198_static_recursive_power {
    static int power(int b, int e) {
        if (e == 0) return 1;
        return b * power(b, e - 1);
    }

    public static void main(String[] args) {
        System.out.println("2 to the power 5: " + power(2, 5));
    }
}

//output
//2 to the power 5: 32
