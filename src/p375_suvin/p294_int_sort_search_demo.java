//294) Write a program to demonstrate interface implementation by creating objects of the list and dictionary classes and invoking interface methods.

package p375_suvin;

public class p294_int_sort_search_demo {
    public static void main(String[] args) {
        interface Searchable { void search(String key); }
        class Dictionary implements Searchable { public void search(String key) { System.out.println("Found: " + key); } }
        
        Dictionary d = new Dictionary();
        d.search("Java");
    }
}

//output
//Found: Java
