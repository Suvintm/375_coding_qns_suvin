//172) Create a class representing a box with private member variables (length, width, height) and public methods (getters and setters).

package p375_suvin;

class Box {
    private double length;
    private double width;
    private double height;

    public void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    public double getVolume() { return length * width * height; }
}

public class p172_box_encap {
    public static void main(String[] args) {
        Box b = new Box();
        b.setDimensions(10, 5, 2);
        System.out.println("Box Volume: " + b.getVolume());
    }
}

//output
//Box Volume: 100.0
