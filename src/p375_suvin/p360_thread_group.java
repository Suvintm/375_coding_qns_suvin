//360) Write a Java program to create multiple threads and use thread group.

package p375_suvin;

public class p360_thread_group {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Parent Group");
        Thread t1 = new Thread(tg, () -> System.out.println("T1 in group"), "T1");
        Thread t2 = new Thread(tg, () -> System.out.println("T2 in group"), "T2");
        t1.start(); t2.start();
        System.out.println("Group Name: " + tg.getName());
    }
}

//output
//Group Name: Parent Group
//T1 in group
//T2 in group
