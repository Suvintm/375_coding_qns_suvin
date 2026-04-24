//227) Write an abstract class "Animal" with abstract methods "eat" and "sleep". Implement it in subclasses "Dog" and "Cat".

package p375_suvin;

abstract class AnimalV3 {
    abstract void eat();
    abstract void sleep();
}

class DogV3 extends AnimalV3 {
    void eat() { System.out.println("Dog is eating"); }
    void sleep() { System.out.println("Dog is sleeping"); }
}

public class p227_animal_abs {
    public static void main(String[] args) {
        AnimalV3 a = new DogV3();
        a.eat();
        a.sleep();
    }
}

//output
//Dog is eating
//Dog is sleeping
