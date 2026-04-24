//211) Write an abstract class "Appliance" with abstract methods "turnOn" and "turnOff". Implement it in subclasses "Fan" and "AC".

package p375_suvin;

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance {
    void turnOn() { System.out.println("Fan is rotating"); }
    void turnOff() { System.out.println("Fan stopped"); }
}

class AC extends Appliance {
    void turnOn() { System.out.println("AC is cooling"); }
    void turnOff() { System.out.println("AC stopped"); }
}

public class p211_abs_appliance {
    public static void main(String[] args) {
        Appliance a = new AC();
        a.turnOn();
        a.turnOff();
    }
}

//output
//AC is cooling
//AC stopped
