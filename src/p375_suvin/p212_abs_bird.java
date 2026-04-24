//212) Write an abstract class "Bird" with abstract methods "fly" and "eat". Implement it in subclasses "Eagle" and "Penguin".

package p375_suvin;

abstract class Bird {
    abstract void fly();
    abstract void eat();
}

class Eagle extends Bird {
    void fly() { System.out.println("Eagle flies high"); }
    void eat() { System.out.println("Eagle eats meat"); }
}

class Penguin extends Bird {
    void fly() { System.out.println("Penguin cannot fly"); }
    void eat() { System.out.println("Penguin eats fish"); }
}

public class p212_abs_bird {
    public static void main(String[] args) {
        Bird b = new Penguin();
        b.fly();
        b.eat();
    }
}

//output
//Penguin cannot fly
//Penguin eats fish
