//268) Write a program to handle ArrayStoreException.

package p375_suvin;

public class p268_ex_array_store {
    public static void main(String[] args) {
        try {
            Object[] x = new String[3];
            x[0] = Integer.valueOf(0);
        } catch (ArrayStoreException e) {
            System.out.println("Exception caught: Incompatible type for array store.");
        }
    }
}

//output
//Exception caught: Incompatible type for array store.
