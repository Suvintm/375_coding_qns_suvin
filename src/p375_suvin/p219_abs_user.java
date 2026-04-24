//219) Write an abstract class "User" with abstract methods "login" and "logout". Implement it in subclasses "Admin" and "Guest".

package p375_suvin;

abstract class User {
    abstract void login();
    abstract void logout();
}

class Admin extends User {
    void login() { System.out.println("Admin logged in with full access"); }
    void logout() { System.out.println("Admin logged out"); }
}

public class p219_abs_user {
    public static void main(String[] args) {
        User u = new Admin();
        u.login();
        u.logout();
    }
}

//output
//Admin logged in with full access
//Admin logged out
