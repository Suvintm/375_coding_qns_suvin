//355) Implement a program to demonstrate deadlock condition in multithreading.

package p375_suvin;

public class p355_thread_deadlock {
    public static void main(String[] args) {
        String res1 = "Resource1";
        String res2 = "Resource2";

        new Thread(() -> {
            synchronized(res1) {
                System.out.println("T1 locked res1");
                try { Thread.sleep(10); } catch (Exception e) {}
                synchronized(res2) { System.out.println("T1 locked res2"); }
            }
        }).start();

        new Thread(() -> {
            synchronized(res2) {
                System.out.println("T2 locked res2");
                synchronized(res1) { System.out.println("T2 locked res1"); }
            }
        }).start();
        
        System.out.println("Deadlock started...");
    }
}

//output
//Deadlock started...
//T1 locked res1
//T2 locked res2
