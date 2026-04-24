//285) Create interfaces "Flyable" and "Swimable" with methods "fly()" and "swim()". Implement them in classes representing a bird and a fish.

package p375_suvin;

interface Flyable { void fly(); }
interface Swimable { void swim(); }

class BirdInt implements Flyable {
    public void fly() { System.out.println("Bird flies"); }
}

class FishInt implements Swimable {
    public void swim() { System.out.println("Fish swims"); }
}

public class p285_int_flyable_swimable {
    public static void main(String[] args) {
        System.out.println("Flyable/Swimable interfaces and implementations created.");
    }
}

//output
//Flyable/Swimable interfaces and implementations created.
