//151) Create a class representing a student with private member variables (name, roll number, age) and public methods (getters and setters).

package p375_suvin;

class StudentA {
    private String name;
    private int roll;
    private int age;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setRoll(int r) { roll = r; }
    public int getRoll() { return roll; }
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}

public class p151_student_age_encap {
    public static void main(String[] args) {
        StudentA s = new StudentA();
        s.setName("Suvin");
        s.setRoll(101);
        s.setAge(20);
        System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll() + ", Age: " + s.getAge());
    }
}

//output
//Name: Suvin, Roll: 101, Age: 20
