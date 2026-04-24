//174) Create a class representing an animal with private member variables (species, age, weight) and public methods (getters and setters).

package p375_suvin;

class Animal {
    private String species;
    private int age;
    private double weight;

    public void setSpecies(String s) { species = s; }
    public String getSpecies() { return species; }
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
    public void setWeight(double w) { weight = w; }
    public double getWeight() { return weight; }
}

public class p174_animal_encap {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setSpecies("Lion");
        a.setAge(5);
        a.setWeight(190);
        System.out.println("Species: " + a.getSpecies() + ", Age: " + a.getAge() + ", Weight: " + a.getWeight() + "kg");
    }
}

//output
//Species: Lion, Age: 5, Weight: 190.0kg
