//223) Write an abstract class "Weapon" with abstract methods "attack". Implement it in subclasses "Sword" and "Bow".

package p375_suvin;

abstract class Weapon {
    abstract void attack();
}

class Sword extends Weapon {
    void attack() { System.out.println("Swinging sword!"); }
}

class Bow extends Weapon {
    void attack() { System.out.println("Shooting arrow!"); }
}

public class p223_abs_weapon {
    public static void main(String[] args) {
        Weapon w = new Sword();
        w.attack();
    }
}

//output
//Swinging sword!
