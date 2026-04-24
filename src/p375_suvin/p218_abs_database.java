//218) Write an abstract class "Database" with abstract methods "connect" and "disconnect". Implement it in subclasses "MySQL" and "MongoDB".

package p375_suvin;

abstract class Database {
    abstract void connect();
    abstract void disconnect();
}

class MySQL extends Database {
    void connect() { System.out.println("MySQL Connected"); }
    void disconnect() { System.out.println("MySQL Disconnected"); }
}

public class p218_abs_database {
    public static void main(String[] args) {
        Database db = new MySQL();
        db.connect();
        db.disconnect();
    }
}

//output
//MySQL Connected
//MySQL Disconnected
