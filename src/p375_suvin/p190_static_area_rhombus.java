//190) Write a program to find the area of a rhombus using a static method.

package p375_suvin;

public class p190_static_area_rhombus {
    static double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static void main(String[] args) {
        System.out.println("Area of rhombus (d1=10, d2=12): " + area(10, 12));
    }
}

//output
//Area of rhombus (d1=10, d2=12): 60.0
