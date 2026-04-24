//186) Write a program to find the volume of a cylinder using a static method.

package p375_suvin;

public class p186_static_volume_cylinder {
    static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        System.out.println("Volume (r=5, h=10): " + String.format("%.2f", volume(5, 10)));
    }
}

//output
//Volume (r=5, h=10): 785.40
