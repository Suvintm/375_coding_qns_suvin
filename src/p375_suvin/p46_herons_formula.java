//46) Write a program to calculate the area of a triangle using Heron’s formula.

package p375_suvin;

public class p46_herons_formula {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }
}

//output
//Area of triangle: 6.0
