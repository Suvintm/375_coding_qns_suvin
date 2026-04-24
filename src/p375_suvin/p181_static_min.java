//181) Write a program to find the minimum of two numbers using a static method.

package p375_suvin;

public class p181_static_min {
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Min of 50 and 100: " + min(50, 100));
    }
}

//output
//Min of 50 and 100: 50
