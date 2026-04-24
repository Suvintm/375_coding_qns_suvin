//287) Create interfaces "Comparable" and "Cloneable" with methods "compareTo()" and "clone()". Implement them in classes representing a number and a person.

package p375_suvin;

interface ComparableInt {
    int compareTo(Object o);
}

interface CloneableInt {
    Object clone();
}

class NumberInt implements ComparableInt, CloneableInt {
    int val;
    NumberInt(int val) { this.val = val; }
    public int compareTo(Object o) { return this.val - ((NumberInt)o).val; }
    public Object clone() { return new NumberInt(this.val); }
}

public class p287_int_comp_clone_classes {
    public static void main(String[] args) {
        System.out.println("Comparable and Cloneable interfaces implemented in Number class.");
    }
}

//output
//Comparable and Cloneable interfaces implemented in Number class.
