//290) Write a program to demonstrate interface implementation by creating objects of the array list and hash set classes and invoking interface methods.

package p375_suvin;

public class p290_int_list_set_demo {
    public static void main(String[] args) {
        interface List { void add(String s); }
        class MyList implements List { public void add(String s) { System.out.println("Item: " + s); } }
        
        MyList l = new MyList();
        l.add("Apple");
    }
}

//output
//Item: Apple
