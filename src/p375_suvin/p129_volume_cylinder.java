//129) Write a program to find the volume of a cylinder.

package p375_suvin;

public class p129_volume_cylinder {
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        System.out.println("Volume of cylinder (r=5, h=10): " + String.format("%.2f", volume(5.0, 10.0)));
    }
}

//output
//Volume of cylinder (r=5, h=10): 785.40
