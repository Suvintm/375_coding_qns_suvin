//284) Write a program to demonstrate interface implementation by creating objects of the shape class and invoking interface methods.

package p375_suvin;

public class p284_int_shape_demo {
    public static void main(String[] args) {
        // Local interfaces for self-containment
        interface Drawable { void draw(); }
        interface Resizable { void resize(); }
        class Shape implements Drawable, Resizable {
            public void draw() { System.out.println("Shape drawn."); }
            public void resize() { System.out.println("Shape resized."); }
        }
        
        Shape s = new Shape();
        s.draw();
        s.resize();
    }
}

//output
//Shape drawn.
//Shape resized.
