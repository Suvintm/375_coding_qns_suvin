//357) Implement a program to demonstrate thread local variables.

package p375_suvin;

public class p357_thread_local {
    public static void main(String[] args) {
        ThreadLocal<Integer> tl = ThreadLocal.withInitial(() -> 0);
        new Thread(() -> { tl.set(100); System.out.println("T1 Value: " + tl.get()); }).start();
        new Thread(() -> { tl.set(200); System.out.println("T2 Value: " + tl.get()); }).start();
    }
}

//output
//T1 Value: 100
//T2 Value: 200
