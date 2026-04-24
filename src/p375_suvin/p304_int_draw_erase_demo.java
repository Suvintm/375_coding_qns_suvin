//304) Write a program to demonstrate interface implementation by creating objects of the whiteboard and chalkboard classes and invoking interface methods.

package p375_suvin;

public class p304_int_draw_erase_demo {
    public static void main(String[] args) {
        interface Erasable { void erase(); }
        class Chalkboard implements Erasable { public void erase() { System.out.println("Chalkboard cleaned."); } }
        
        Chalkboard c = new Chalkboard();
        c.erase();
    }
}

//output
//Chalkboard cleaned.
