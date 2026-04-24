//296) Write a program to demonstrate interface implementation by creating objects of the file and database classes and invoking interface methods.

package p375_suvin;

public class p296_int_ser_deser_demo {
    public static void main(String[] args) {
        interface Serializable { void save(); }
        class Database implements Serializable { public void save() { System.out.println("Data saved to DB."); } }
        
        Database db = new Database();
        db.save();
    }
}

//output
//Data saved to DB.
