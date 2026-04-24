//176) Write a program to count the number of objects created for a class using a static variable.

package p375_suvin;

class ObjectCounter {
    static int count = 0;
    ObjectCounter() {
        count++;
    }
}

public class p176_count_objects {
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Total objects created: " + ObjectCounter.count);
    }
}

//output
//Total objects created: 3
