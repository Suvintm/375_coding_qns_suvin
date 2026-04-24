//157) Create a class representing an employee with private member variables (name, id, salary) and public methods (getters and setters).

package p375_suvin;

class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
    public void setSalary(double s) { salary = s; }
    public double getSalary() { return salary; }
}

public class p157_employee_encap {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Rahul");
        e.setId(501);
        e.setSalary(45000);
        System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
    }
}

//output
//ID: 501, Name: Rahul, Salary: 45000.0
