//286) Write a program to demonstrate interface implementation by creating objects of the bird and fish classes and invoking interface methods.

package p375_suvin;

public class p286_int_bird_fish_demo {
    public static void main(String[] args) {
        interface Flyable { void fly(); }
        interface Swimable { void swim(); }
        class Bird implements Flyable { public void fly() { System.out.println("Eagle flying..."); } }
        class Fish implements Swimable { public void swim() { System.out.println("Shark swimming..."); } }
        
        new Bird().fly();
        new Fish().swim();
    }
}

//output
//Eagle flying...
//Shark swimming...
