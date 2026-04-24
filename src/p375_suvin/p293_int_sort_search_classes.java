//293) Create interfaces "Sortable" and "Searchable" with methods "sort()" and "search()". Implement them in classes representing a list and a dictionary.

package p375_suvin;

interface Sortable { void sort(); }
interface Searchable { void search(String key); }

class MyDictionary implements Searchable {
    public void search(String key) { System.out.println("Searching for " + key + " in dictionary"); }
}

public class p293_int_sort_search_classes {
    public static void main(String[] args) {
        System.out.println("Sortable and Searchable interfaces created.");
    }
}

//output
//Sortable and Searchable interfaces created.
