//300) Write a program to demonstrate interface implementation by creating objects of the cheetah and tortoise classes and invoking interface methods.

package p375_suvin;

public class p300_int_run_walk_demo {
    public static void main(String[] args) {
        interface Walkable { void walk(); }
        class Tortoise implements Walkable { public void walk() { System.out.println("Tortoise walking slowly..."); } }
        
        Tortoise t = new Tortoise();
        t.walk();
    }
}

//output
//Tortoise walking slowly...
