//311) Create interfaces "Drawable" and "Printable" with methods "draw()" and "print()". Implement them in classes representing a canvas and a printer.

package p375_suvin;

interface DrawableV3 { void draw(); }
interface PrintableV3 { void print(); }

class Canvas implements DrawableV3 {
    public void draw() { System.out.println("Painting on canvas..."); }
}

public class p311_int_draw_print_classes {
    public static void main(String[] args) {
        System.out.println("Drawable and Printable interfaces implemented.");
    }
}

//output
//Drawable and Printable interfaces implemented.
