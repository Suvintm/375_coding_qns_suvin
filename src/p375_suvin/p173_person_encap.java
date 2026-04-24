//173) Create a class representing a person with private member variables (name, gender, height) and public methods (getters and setters).

package p375_suvin;

class Person {
    private String name;
    private String gender;
    private double height;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setGender(String g) { gender = g; }
    public String getGender() { return gender; }
    public void setHeight(double h) { height = h; }
    public double getHeight() { return height; }
}

public class p173_person_encap {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Vikram");
        p.setGender("Male");
        p.setHeight(175.5);
        System.out.println("Name: " + p.getName() + ", Gender: " + p.getGender() + ", Height: " + p.getHeight() + "cm");
    }
}

//output
//Name: Vikram, Gender: Male, Height: 175.5cm
