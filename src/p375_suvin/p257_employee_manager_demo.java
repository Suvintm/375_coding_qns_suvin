//257) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Employee/Manager)

package p375_suvin;

public class p257_employee_manager_demo {
    public static void main(String[] args) {
        class Employee { String name = "Alice"; double salary = 60000; }
        class Manager extends Employee { String dept = "HR"; }
        
        Manager m = new Manager();
        System.out.println("Name: " + m.name + ", Salary: " + m.salary + ", Dept: " + m.dept);
    }
}

//output
//Name: Alice, Salary: 60000.0, Dept: HR
