//289) Create interfaces "List" and "Set" with methods "add()", "remove()", and "contains()". Implement them in classes representing an array list and a hash set.

package p375_suvin;

interface ListInt {
    void add(String s);
    void remove(String s);
}

interface SetInt {
    boolean contains(String s);
}

class MyArrayList implements ListInt {
    public void add(String s) { System.out.println("Added to List: " + s); }
    public void remove(String s) { System.out.println("Removed from List: " + s); }
}

public class p289_int_list_set_classes {
    public static void main(String[] args) {
        System.out.println("List and Set interfaces created.");
    }
}

//output
//List and Set interfaces created.
