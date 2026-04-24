//288) Write a program to demonstrate interface implementation by creating objects of the number and person classes and invoking interface methods.

package p375_suvin;

public class p288_int_comp_clone_demo {
    public static void main(String[] args) {
        interface Comparable { int compare(int a, int b); }
        class Person implements Comparable {
            public int compare(int a, int b) { return a - b; }
        }
        
        Person p = new Person();
        System.out.println("Comparison result: " + p.compare(10, 5));
    }
}

//output
//Comparison result: 5
