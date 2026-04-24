//226) Write a program to demonstrate abstraction by creating objects of subclasses and invoking abstract methods.

package p375_suvin;

abstract class TestAbs {
    abstract void show();
}

class SampleAbs extends TestAbs {
    void show() { System.out.println("General Abstraction Demo"); }
}

public class p226_general_abs_demo {
    public static void main(String[] args) {
        TestAbs t = new SampleAbs();
        t.show();
    }
}

//output
//General Abstraction Demo
