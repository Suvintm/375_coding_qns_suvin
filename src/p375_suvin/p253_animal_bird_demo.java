//253) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Animal/Bird)

package p375_suvin;

public class p253_animal_bird_demo {
    public static void main(String[] args) {
        class Animal { String name = "Parrot"; }
        class Bird extends Animal { double wings = 20.5; }
        
        Bird b = new Bird();
        System.out.println("Name: " + b.name + ", Wingspan: " + b.wings);
    }
}

//output
//Name: Parrot, Wingspan: 20.5
