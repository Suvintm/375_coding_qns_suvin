//189) Write a program to find the area of a square using a static method.

package p375_suvin;

public class p189_static_area_square {
    static double area(double s) {
        return s * s;
    }

    public static void main(String[] args) {
        System.out.println("Area of square (side=10): " + area(10));
    }
}

//output
//Area of square (side=10): 100.0
