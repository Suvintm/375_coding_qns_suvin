//238) Create a base class "Employee" with properties (name, id, salary) and a subclass "Manager" with additional properties (department, designation). Write a program to demonstrate inheritance.

package p375_suvin;

class Employee {
    String name;
    int id;
    double salary;
    void showEmp() { System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary); }
}

class Manager extends Employee {
    String department;
    String designation;
    void showMgr() { System.out.println("Dept: " + department + ", Desig: " + designation); }
}

public class p238_employee_inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rahul";
        m.id = 101;
        m.salary = 75000;
        m.department = "IT";
        m.designation = "Lead Engineer";
        m.showEmp();
        m.showMgr();
    }
}

//output
//Name: Rahul, ID: 101, Salary: 75000.0
//Dept: IT, Desig: Lead Engineer
