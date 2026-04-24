//180) Write a program to find the maximum of two numbers using a static method.

package p375_suvin;

public class p180_static_max {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 50 and 100: " + max(50, 100));
    }
}

//output
//Max of 50 and 100: 100
