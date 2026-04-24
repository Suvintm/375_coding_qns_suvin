//202) Write an abstract class "Animal" with abstract methods "eat" and "sleep". Implement it in subclasses "Dog" and "Cat".

package p375_suvin;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    void eat() { System.out.println("Dog eats meat"); }
    void sleep() { System.out.println("Dog sleeps in kennel"); }
}

class Cat extends Animal {
    void eat() { System.out.println("Cat eats fish"); }
    void sleep() { System.out.println("Cat sleeps on sofa"); }
}

public class p202_abs_animal {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.eat();
        c.sleep();
    }
}

//output
//Dog eats meat
//Cat sleeps on sofa
