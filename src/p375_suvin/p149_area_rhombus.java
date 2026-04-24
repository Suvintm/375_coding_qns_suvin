//149) Write a program to find the area of a rhombus.

package p375_suvin;

public class p149_area_rhombus {
    public static double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static void main(String[] args) {
        System.out.println("Area of rhombus (d1=6, d2=8): " + area(6, 8));
    }
}

//output
//Area of rhombus (d1=6, d2=8): 24.0
