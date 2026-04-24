//167) Create a class representing a hospital with private member variables (name, location, capacity) and public methods (getters and setters).

package p375_suvin;

class Hospital {
    private String name;
    private String location;
    private int capacity;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setLocation(String l) { location = l; }
    public String getLocation() { return location; }
    public void setCapacity(int c) { capacity = c; }
    public int getCapacity() { return capacity; }
}

public class p167_hospital_encap {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.setName("City Hospital");
        h.setLocation("Downtown");
        h.setCapacity(500);
        System.out.println("Hospital: " + h.getName() + " at " + h.getLocation() + ", Capacity: " + h.getCapacity());
    }
}

//output
//Hospital: City Hospital at Downtown, Capacity: 500
