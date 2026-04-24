//203) Write an abstract class "Employee" with abstract methods "calculateSalary" and "calculateBonus". Implement it in subclasses "Manager" and "Clerk".

package p375_suvin;

abstract class Employee {
    abstract double calculateSalary();
    abstract double calculateBonus();
}

class Manager extends Employee {
    double calculateSalary() { return 80000; }
    double calculateBonus() { return 10000; }
}

class Clerk extends Employee {
    double calculateSalary() { return 30000; }
    double calculateBonus() { return 2000; }
}

public class p203_abs_employee {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee c = new Clerk();
        System.out.println("Manager Salary: " + m.calculateSalary() + ", Bonus: " + m.calculateBonus());
        System.out.println("Clerk Salary: " + c.calculateSalary() + ", Bonus: " + c.calculateBonus());
    }
}

//output
//Manager Salary: 80000.0, Bonus: 10000.0
//Clerk Salary: 30000.0, Bonus: 2000.0
